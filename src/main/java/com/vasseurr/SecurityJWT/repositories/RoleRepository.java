package com.vasseurr.SecurityJWT.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasseurr.SecurityJWT.entities.ERole;
import com.vasseurr.SecurityJWT.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(ERole name);
}
