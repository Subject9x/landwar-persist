package org.landwar.persist.dao;

import java.util.List;

import org.landwar.persist.entity.UserEntity;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Query;

@Repository
public class UserDao extends BaseDao<UserEntity> {
	
	
	@SuppressWarnings("unchecked")
	public List<UserEntity> getUsers(){
		
		List<UserEntity> users = null;
		
		Query query = em().createNamedQuery("UserEntity.getAllUsers");
		
		users = (List<UserEntity>)query.getResultList();
		
		return users;
		
	}
	
	public UserDao() {
		setClazz(UserEntity.class);
	}
	
}
