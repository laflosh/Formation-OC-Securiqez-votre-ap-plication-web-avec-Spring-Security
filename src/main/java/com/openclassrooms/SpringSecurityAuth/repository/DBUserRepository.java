package com.openclassrooms.SpringSecurityAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.openclassrooms.SpringSecurityAuth.model.DBUser;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {

	public DBUser findByUsername(String username);
	
}
