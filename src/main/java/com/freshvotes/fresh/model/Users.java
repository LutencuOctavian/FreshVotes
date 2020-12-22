package com.freshvotes.fresh.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users  {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Long id;

    @Column(name="user_name", length = 50)
    private String userName;

    @Column(name="password", length = 50)
    private String password;

    @Column(name="first_name")
    private String firstName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPssword() {
        return password;
    }

    public void setPssword(String pssword) {
        this.password = pssword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
