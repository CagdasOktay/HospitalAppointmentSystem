package com.cagdas.HospitalAppointmentSystem.repository;


import com.cagdas.HospitalAppointmentSystem.repository.entities.HastaDetay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHastaDetayRepository extends JpaRepository<HastaDetay,Long> {

}
