package com.example.demo.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Scale;

@Repository
public class ResultSearchRepo {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
    public Collection searchResults(String text) {
        return mongoTemplate.find(Query.query(new Criteria()
                        .orOperator(Criteria.where("email").regex(text, "i"))), Scale.class);
    }

}
