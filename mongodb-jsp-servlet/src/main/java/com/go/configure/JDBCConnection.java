package com.go.configure;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class JDBCConnection {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase database = mongoClient.getDatabase("employee");
		MongoCollection<Document> collection = database.getCollection("employee");
		Block<Document> printBlock = new Block<Document>() {
		       @Override
		       public void apply(final Document document) {
		           System.out.println(document.toJson());
		       }
		};
		collection.find().forEach(printBlock);
	}


}
