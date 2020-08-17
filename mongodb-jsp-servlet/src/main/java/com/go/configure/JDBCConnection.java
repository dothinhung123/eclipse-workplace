package com.go.configure;


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class JDBCConnection {
//	public static void main(String[] args) {
//		MongoClient mongoClient = new MongoClient("localhost", 27017);
//		MongoDatabase database = mongoClient.getDatabase("employee");
//		MongoCollection<Document> collection = database.getCollection("employee");
//
//		Block<Document> printBlock = new Block<Document>() {
//		       @Override
//		       public void apply(final Document document) {
//		           System.out.println(document.toJson());
//		       }
//		};
//		List<Document> foundDocument = collection.find().into(new ArrayList<Document>());
//		for(Document i :foundDocument) {
//			System.out.print(i.get("_id"));
//		}
//		collection.find().forEach(printBlock);
//	}

   
}
