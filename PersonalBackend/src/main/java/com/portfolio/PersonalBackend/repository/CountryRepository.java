package com.portfolio.PersonalBackend.repository;

import com.portfolio.PersonalBackend.model.Country;
import com.portfolio.PersonalBackend.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
