package com.ndumiso.domain.entity;

import lombok.Data;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public class AbstractEntity {

    private String id = UUID.randomUUID().toString();

    private LocalDateTime creationDate = LocalDateTime.now();
}
