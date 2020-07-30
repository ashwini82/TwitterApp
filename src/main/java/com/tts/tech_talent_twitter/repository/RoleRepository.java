package com.tts.tech_talent_twitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tts.tech_talent_twitter.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(String role);

}