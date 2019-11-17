package com.transit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.transit.entity.UserChannelEntity;
import com.transit.entity.UserEntity;

@Repository
public interface UserChannelRepository extends CrudRepository<UserChannelEntity, Long> {
	public UserChannelEntity findByUserAndChannelId(@Param("user") UserEntity user, @Param("channelId") String channelId);
	public List<UserChannelEntity> findAllByUser(@Param("user") UserEntity user); 
	public List<UserChannelEntity> findAllByFlag(@Param("flag") boolean flag);
}
