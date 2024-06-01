package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(collection="reviews")
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	
	private ObjectId id;
	private String body;
	
	
	public Review(String body) {
		super();
		this.body = body;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
