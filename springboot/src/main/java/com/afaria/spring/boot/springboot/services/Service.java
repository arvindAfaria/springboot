package com.afaria.spring.boot.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.afaria.spring.boot.springboot.dao.DAO;

@org.springframework.stereotype.Service
public class Service {

	DAO dao;

	@Autowired
	Service(DAO dao) {
		System.out.println("service bean created");
		this.dao = dao;
	}

	public void save() {
		dao.create();
	}
}
