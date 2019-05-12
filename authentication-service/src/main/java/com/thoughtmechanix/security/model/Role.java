package com.thoughtmechanix.security.model;

import javax.persistence.*;

@Entity
@Table(name = "user_roles_ta")
public class Role{

    @Id
    @Column(name = "role_id", nullable = false)
    private String roleId;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "role", nullable = false)
    private String role;

    public Role() {
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
