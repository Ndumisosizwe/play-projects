package com.ndumiso.security.JWTSecurity.entity.authentication;

import com.ndumiso.security.JWTSecurity.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class User extends BaseEntity {

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private int active;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;


    @Builder
    public User(String email, String password, String name, String lastName, int active, Set<Role> roles) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.active = active;
        this.roles = roles;
    }
}
