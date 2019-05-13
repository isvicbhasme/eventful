package com.isaac.eventful.repository;

import com.isaac.eventful.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findRole(String role);
}
