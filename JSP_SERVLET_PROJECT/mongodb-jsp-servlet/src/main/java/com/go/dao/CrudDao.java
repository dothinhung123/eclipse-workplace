package com.go.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.go.model.Employee;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class CrudDao {
	private MongoClient mongoClient;
	private MongoDatabase mongoDB;
	public CrudDao(){
		 mongoClient = new MongoClient("localhost", 27017);
		 mongoDB = mongoClient.getDatabase("employee");
	}
	public List<Employee> getAllEmployees(){
		MongoCollection<Document> collection = mongoDB.getCollection("employee");
		List<Document> employees = collection.find().into(new ArrayList<Document>());
		List<Employee> e = new ArrayList<>();
		for(Document doc : employees) {
			Employee y = convertToModel(doc);
			e.add(y);
		
		}
		return e;
		
	}
	public Employee convertToModel(Document document) {
		Employee e = new Employee();
		e.setId(document.getString("_id"));
		e.setName(document.getString("name"));
		e.setEmail(document.getString("email"));
		e.setAddress(document.getString("address"));
		e.setPhone(document.getString("phone"));
		return e;
	}
	

}
