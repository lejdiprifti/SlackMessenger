package com.transit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transit.entity.DataEntity;

@Repository
public interface MessageRepository extends CrudRepository<DataEntity, Long> {
}
