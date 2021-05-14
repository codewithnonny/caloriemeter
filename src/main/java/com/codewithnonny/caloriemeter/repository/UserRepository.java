package com.codewithnonny.caloriemeter.repository;


import com.codewithnonny.caloriemeter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
