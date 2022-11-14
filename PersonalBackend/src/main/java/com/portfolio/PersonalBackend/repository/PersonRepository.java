package com.portfolio.PersonalBackend.repository;

import com.portfolio.PersonalBackend.model.Person;
import com.portfolio.PersonalBackend.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
