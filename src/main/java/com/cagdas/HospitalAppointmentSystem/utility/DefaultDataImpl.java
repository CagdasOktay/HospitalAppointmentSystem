package com.cagdas.HospitalAppointmentSystem.utility;


import com.cagdas.HospitalAppointmentSystem.repository.entities.Hasta;
import com.cagdas.HospitalAppointmentSystem.repository.entities.HastaDetay;
import com.cagdas.HospitalAppointmentSystem.repository.enums.Cinsiyet;
import com.cagdas.HospitalAppointmentSystem.service.HastaDetayServis;
import com.cagdas.HospitalAppointmentSystem.service.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class DefaultDataImpl {
    private final HastaService hastaService;
    private final HastaDetayServis hastaDetayServis;
    @PostConstruct
    private void create(){
        saveHasta();
    }

    private void saveHasta() {
        HastaDetay hastaDetay1=HastaDetay.builder()
                .tcno("12345678912")
                .ad("Cagdas")
                .soyad("Oktay")
                .adres("Izmir")
                .telefon("05303334455")
                .uyruk("TC")
                .tedavi(false)
                .date(LocalDate.parse("1987-03-16"))
                .build();

        HastaDetay hastaDetay2=HastaDetay.builder()
                .tcno("12345678912")
                .ad("Peri")
                .soyad("Oktay")
                .adres("Izmir")
                .telefon("05303332244")
                .uyruk("TC")
                .tedavi(false)
                .date(LocalDate.parse("1988-07-27"))
                .build();

        HastaDetay hastaDetay3=HastaDetay.builder()
                .tcno("12345678912")
                .ad("Nil")
                .soyad("Oktay")
                .adres("Izmir")
                .telefon("-")
                .uyruk("TC")
                .tedavi(false)
                .date(LocalDate.parse("2019-04-12"))
                .build();

        HastaDetay hastaDetay4=HastaDetay.builder()
                .tcno("12345678912")
                .ad("Deniz")
                .soyad("Oktay")
                .adres("Izmir")
                .telefon("-")
                .uyruk("TC")
                .tedavi(false)
                .date(LocalDate.parse("2021-12-07"))
                .build();

        Hasta hasta1= Hasta.builder()
                .kullaniciadi("jordan23")
                .sifre("1223334")
                .email("cagdas@gmail.com")
                .cinsiyet(Cinsiyet.ERKEK)
                .hastaDetay(hastaDetay1)
                .build();

        Hasta hasta2= Hasta.builder()
                .kullaniciadi("peri")
                .sifre("4332221")
                .email("peri@gmail.com")
                .cinsiyet(Cinsiyet.KADIN)
                .hastaDetay(hastaDetay2)
                .build();

        hastaService.saveAll(Arrays.asList(hasta1,hasta2));
    }
}
