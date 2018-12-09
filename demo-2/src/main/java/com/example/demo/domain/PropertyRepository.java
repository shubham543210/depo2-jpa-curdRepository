package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Property;

public interface PropertyRepository extends CrudRepository<Property,Integer> {

}
