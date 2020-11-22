package com.web.store.repository;


import com.web.store.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {

    RoleEntity findAllById(@Param("id") int id);
}
