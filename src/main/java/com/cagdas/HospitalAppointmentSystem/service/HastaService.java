package com.cagdas.HospitalAppointmentSystem.service;


import com.cagdas.HospitalAppointmentSystem.repository.IHastaRepository;
import com.cagdas.HospitalAppointmentSystem.repository.entities.Hasta;
import com.cagdas.HospitalAppointmentSystem.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HastaService extends ServiceManager<Hasta,Long> {

    private final IHastaRepository hastaRepository;

    public HastaService(IHastaRepository hastaRepository){
        super(hastaRepository);
        this.hastaRepository=hastaRepository;
    }
    public Optional<Hasta> login (String kullaniciadi, String sifre){
        Optional<Hasta> hasta=hastaRepository.findOptionalByKullaniciadiAndSifre(kullaniciadi,sifre);

        if (hasta.isEmpty()){

            System.out.println("Hasta bulunamadı.");
            return Optional.ofNullable(null);
        }
        return hasta;
    }

    public Optional<Hasta> register(String kullaniciadi, String email) {
        Optional<Hasta> hasta=hastaRepository.findOptionalByKullaniciadiOrEmail(kullaniciadi,email);

        if (hasta.isEmpty()){

            System.out.println("Böyle bir hasta yoktur");
            return Optional.ofNullable(null);
        }
        return hasta;
    }
}
