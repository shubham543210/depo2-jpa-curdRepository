package com.example.demo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Details2;

public interface Details2Repository extends CrudRepository<Details2,String>{

	public List<Details2> findByPropertyLid(int lid);
}
