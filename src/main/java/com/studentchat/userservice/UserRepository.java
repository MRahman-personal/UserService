package com.studentchat.userservice;

import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

@Repository
public interface UserRepository extends CosmosRepository<ChatUser, String> {
}

