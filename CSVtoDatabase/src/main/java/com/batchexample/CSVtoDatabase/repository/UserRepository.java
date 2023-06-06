package com.batchexample.CSVtoDatabase.repository;

import com.batchexample.CSVtoDatabase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
