package com.go.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.go.model.Employee;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class EmployeeDao {
	private MongoClient mongoClient;
	private MongoDatabase db;
	public EmployeeDao() {
		mongoClient = new MongoClient( "localhost" , 27017 );
         db = mongoClient.getDatabase("employee");
        
        
	}
	public List<Employee> getAllEmployees(){
		MongoCollection<Document> collection = db.getCollection("employee");
		List<Document> docs = collection.find().into(new ArrayList<Document>());
//		List<Employee> e = convertToModel(docs);
//		List<Employee> employees = new ArrayList<Employee>();
//		
//		
		return convertToModel(docs);
	
		
	}
	public void add(Employee e ) {
		MongoCollection<Document> collection = db.getCollection("employee");
		Document doc = new Document();
		doc.append("name", e.getName());
		doc.append("email", e.getEmail());
		doc.append("address", e.getAddress());
		doc.append("phone", e.getPhone());
		collection.insertOne(doc);
		
		
	}
	public void edit(Employee e) {
		MongoCollection<Document> collection = db.getCollection("employee");
		Document doc = new Document();
		doc.append("_id", e.getId());
		doc.append("name", e.getName());
		doc.append("email", e.getEmail());
		doc.append("address", e.getAddress());
		doc.append("phone", e.getPhone());
		System.out.println(doc.get("_id"));
	
//		collection.findOneAndReplace(Filters.eq("_id",doc.get("_id")), doc);
//		collection.updateOne(Filters.eq("_id",doc.get("_id")), doc);
//	collection.findOneAndReplace(Filters.eq("_id", doc.get("_id")), doc);
		collection.updateOne(Filters.eq("_id", doc.get("_id")), Updates.set("name",doc.get("name")));
		
	}
	public void delete(String id) {
		MongoCollection<Document> collection = db.getCollection("employee");
//		Document doc = new Document ();
//		doc.append("_id", id);
		
		collection.findOneAndDelete(Filters.eq("_id",id));
	}
	public List<Employee> convertToModel(List<Document> document) {
		List<Employee> employees = new ArrayList<Employee>();
		for(Document doc : document) {
			Employee e = new Employee();
			e.setId(doc.get("_id").toString());
			e.setName(doc.get("name").toString());
			e.setEmail(doc.get("email").toString());
			e.setAddress(doc.get("address").toString());
			e.setPhone(doc.get("phone").toString());
			employees.add(e);
		}
		
		return employees;
		
	}
	
	
	

}
