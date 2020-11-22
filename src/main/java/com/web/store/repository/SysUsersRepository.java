package com.web.store.repository;

import com.web.store.entity.SysUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SysUsersRepository extends JpaRepository<SysUsersEntity, Integer> {

    SysUsersEntity findAllById(@Param("id") int id);

    SysUsersEntity findAllByEmail(@Param("email") String email);

}
