package com.cagdas.HospitalAppointmentSystem.repository;

import com.cagdas.HospitalAppointmentSystem.repository.entities.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface IHastaRepository extends JpaRepository<Hasta,Long> {


    Optional<Hasta> findOptionalByKullaniciadiAndSifre(String kullaniciadi,String sifre);

    Optional<Hasta> findOptionalByKullaniciadiOrEmail(String kullaniciadi,String email);

}
