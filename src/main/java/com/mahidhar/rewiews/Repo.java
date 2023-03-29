package com.mahidhar.rewiews;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository("Repo")
public interface Repo extends MongoRepository<Data,String> {
	
	List<Data> findByName(String name);
}
