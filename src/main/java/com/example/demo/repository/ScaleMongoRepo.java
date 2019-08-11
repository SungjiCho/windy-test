package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Scale;

public interface ScaleMongoRepo extends CrudRepository<Scale, String>{

}
