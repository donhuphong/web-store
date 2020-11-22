package com.web.store.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_users")
@Data
public class SysUsersEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /**
     * email
     **/
    @Column(name = "email")
    private String email;

    /**
     * password
     **/
    @Column(name = "password")
    private String password;

    /**
     * role
     **/
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * name
     **/
    @Column(name = "name")
    private String name;

    /**
     * createdAt
     **/
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * updatedAt
     **/
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * deletedAt
     **/
    @Column(name = "deleted_at")
    private Date deletedAt;

}
