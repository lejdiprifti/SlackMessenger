package com.transit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transit.entity.MessageEntity;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity, Long> {
}
