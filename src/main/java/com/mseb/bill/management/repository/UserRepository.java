package com.mseb.bill.management.repository;

import com.mseb.bill.management.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity,String> {
}
