package com.portfolio.PersonalBackend.services;

import com.portfolio.PersonalBackend.model.Person;
import com.portfolio.PersonalBackend.repository.PersonRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements PersonRepository {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Person> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Person> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends Person> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Person> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteInBatch(Iterable<Person> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub

    }

    @Override
    public Person getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person getById(Long aLong) {
        return null;
    }

    @Override
    public Person getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Person> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Person> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Person> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Person> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Page<Person> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Person> S save(S entity) {
        return personRepository.save(entity);
    }

    @Override
    public Optional<Person> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Person> entities) {

    }

    @Override
    public void delete(Person entity) {
        personRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }
}
