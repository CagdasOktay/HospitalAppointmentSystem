package com.cagdas.HospitalAppointmentSystem.repository.entities;


import com.cagdas.HospitalAppointmentSystem.repository.enums.Cinsiyet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name="tblhasta")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder

public class Hasta extends Default {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true)
    String kullaniciadi;
    @Column(nullable = false)
    String sifre;
    @Column(nullable = false, unique = true)
    String email;
    @Enumerated(EnumType.STRING)
    Cinsiyet cinsiyet;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "hasta_detay_id")
    HastaDetay hastaDetay;
}
