package com.cagdas.HospitalAppointmentSystem.service;


import com.cagdas.HospitalAppointmentSystem.repository.IHastaDetayRepository;
import com.cagdas.HospitalAppointmentSystem.repository.entities.HastaDetay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HastaDetayServis {
    private final IHastaDetayRepository hastaDetayRepository;

    public HastaDetay save(HastaDetay hastaDetay){
        return hastaDetayRepository.save(hastaDetay);
    }
    public HastaDetay update(HastaDetay hastaDetay){
        return hastaDetayRepository.save(hastaDetay);
    }
    public void delete(HastaDetay hastaDetay){
        hastaDetayRepository.delete(hastaDetay);
    }
    public List<HastaDetay> findAll(){
        return hastaDetayRepository.findAll();
    }
    public Iterable<HastaDetay> saveAll(List<HastaDetay> hastaDetay){
        return hastaDetayRepository.saveAll(hastaDetay);
    }

}
