package com.portfolio.PersonalBackend.repository;

import com.portfolio.PersonalBackend.model.Country;
import com.portfolio.PersonalBackend.model.UserDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDatabaseRepository extends JpaRepository<UserDatabase,Long> {
}
