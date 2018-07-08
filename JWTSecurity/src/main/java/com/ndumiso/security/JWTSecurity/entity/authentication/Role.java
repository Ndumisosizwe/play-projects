package com.ndumiso.security.JWTSecurity.entity.authentication;

import com.ndumiso.security.JWTSecurity.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Role extends BaseEntity {

    @Column
    @Enumerated(value = EnumType.STRING)
    private UserRole name;

    @Builder
    public Role(UserRole name) {
        this.name = name;
    }
}
