package com.cagdas.HospitalAppointmentSystem.repository.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import javax.persistence.MappedSuperclass;

@MappedSuperclass
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Default {
    boolean isactive;
    Long createdate;
    Long updatedate;

}
