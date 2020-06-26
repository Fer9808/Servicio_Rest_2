package com.servicio_rest_2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.servicio_rest_2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
		@Query(value="SELECT u FROM User u ORDER BY u.apaterno ASC, u.amaterno ASC, u.nombre ASC")
		public List<User> getAllUsers();
}
