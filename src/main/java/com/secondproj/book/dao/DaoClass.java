package com.secondproj.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secondproj.book.model.ModelClass;

public interface DaoClass extends JpaRepository<ModelClass, Integer> {
	

}
