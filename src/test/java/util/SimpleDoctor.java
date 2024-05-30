package util;

import my.project.domain.Doctor;

public class SimpleDoctor {


    public static Doctor doctor1(){
        return Doctor.builder()
                .name("Marek")
                .surname("marecki")
                .phone("11111111")
                .email("ad@dasasd.pl")
                .pwz("11111111")
                .specialization("spec1")
                .build();
    }public static Doctor doctor2(){
        return Doctor.builder()
                .name("Arek")
                .surname("marecki")
                .phone("2222222")
                .email("asdasd@dasasd.pl")
                .pwz("22222222")
                .specialization("spec7")
                .build();
    }public static Doctor doctor3(){
        return Doctor.builder()
                .name("Tomek")
                .surname("marecki")
                .phone("333333333")
                .email("assad@dasasd.pl")
                .pwz("333333333")
                .specialization("spec3")
                .build();
    }public static Doctor doctor4(){
        return Doctor.builder()
                .name("Mateusz")
                .surname("marecki")
                .phone("4444444444")
                .email("dasdsad@dasasd.pl")
                .pwz("444444444")
                .specialization("spec2")
                .build();
    }
}
