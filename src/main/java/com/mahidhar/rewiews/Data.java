package com.mahidhar.rewiews;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Review")
public class Data {
	
	@Id
	String id;
	String name;
	String rating;
	String verdict;
	String Review;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getVerdict() {
		return verdict;
	}
	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", rating=" + rating + ", verdict=" + verdict + ", Review="
				+ Review + "]";
	}
	public Data() {
		super();
	}

	
	
	

}
