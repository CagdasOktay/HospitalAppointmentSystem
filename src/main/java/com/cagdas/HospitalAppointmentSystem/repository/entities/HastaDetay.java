package com.cagdas.HospitalAppointmentSystem.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name="tblhastadetay")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder

public class HastaDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    Long hastaid;
    String tcno;
    String ad;
    String soyad;
    String adres;
    String telefon;
    String uyruk;
    boolean tedavi = false;
    LocalDate date;

}
