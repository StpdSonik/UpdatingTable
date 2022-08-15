package com.example.demo2.repository;

import com.example.demo2.model.TableTest1Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<TableTest1Entity, Long> {

}

