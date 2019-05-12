package com.thoughtmechanix.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_company_ta")
public class UserOrganization {

    @Id
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "company_id", nullable = false)
    private String companyId;

    public UserOrganization() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
