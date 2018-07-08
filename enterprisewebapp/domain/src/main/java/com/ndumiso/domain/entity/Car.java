package com.ndumiso.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Car extends AbstractEntity{

    @Column
    private String brand;

    @Column
    private String year;

}
