package com.secondproj.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secondproj.book.dao.DaoClass;
import com.secondproj.book.model.ModelClass;

@Service
public class ServiceImpl {
	
	@Autowired
	private DaoClass daoClass;
	
	public List<ModelClass> view(){
		List<ModelClass>list=daoClass.findAll();
		return list;	
	}
	public ModelClass save(ModelClass modelClass) {
		ModelClass obj =daoClass.save(modelClass);
				return obj;
	}

	public ModelClass findById(int id) {
		ModelClass modelClass=null;
		Optional<ModelClass>optional=daoClass.findById(id);
		if(optional.isPresent()) {
			ModelClass data=optional.get();
			return data;
		}
		return modelClass;	
	}
	public String updatePlace(ModelClass modelClass) {
		String message="data updated sucessfully";
		ModelClass class1=daoClass.findById(modelClass.getId()).get();
		class1.setName(modelClass.getName());
		class1.setLocation(modelClass.getLocation());
		class1.setDescription(modelClass.getDescription());
		daoClass.save(class1);
		
		return message;
		
	}
	public void deltoId(int id) {
		daoClass.deleteById(id);
	}
	//

}
