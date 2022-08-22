package com.secondproj.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.secondproj.book.model.ModelClass;
import com.secondproj.book.service.ServiceImpl;

@RestController
@CrossOrigin(origins ="*")

public class ControllerClass {
	
	@Autowired
	ServiceImpl serviceImpl;
	
	@GetMapping("place/data")
	public List<ModelClass> viewall(){
		List<ModelClass>list=serviceImpl.view();
		return list;
	}
	@PostMapping("/place/save")
	public void  save(@RequestBody ModelClass modelClass) {
		serviceImpl.save(modelClass);
	}
	@DeleteMapping("/place/del/{id}")
	public void delete(@PathVariable("id")int id) {
		serviceImpl.deltoId(id);
	}
	
	@PutMapping("/place/update")
	public String placeUpdate(@RequestBody ModelClass modelClass) {
		String data=serviceImpl.updatePlace(modelClass);
		return data;
	}
	@GetMapping("/place/view")
	public ModelClass viewById(@RequestParam int id) {
		ModelClass modelClass=serviceImpl.findById(id);
		return modelClass;
	}
	

}
