package util;

import my.project.infrastructure.database.entity.PatientEntity;

public class ExamplePatient {


    public static PatientEntity patientEntity1(){
        return PatientEntity.builder()
                .name("Marek")
                .surname("marecki")
                .phone("1111111")
                .email("1111111@gmail.com")
                .pesel("1111111")
                .build();
    }public static PatientEntity patientEntity2(){
        return PatientEntity.builder()
                .name("Darek")
                .surname("Darecki")
                .phone("2222222")
                .email("2222222@gmail.com")
                .pesel("2222222")
                .build();
    }public static PatientEntity patientEntity3(){
        return PatientEntity.builder()
                .name("Tomek")
                .surname("Tomecki")
                .phone("3333333")
                .email("3333333@gmail.com")
                .pesel("3333333")
                .build();
    }public static PatientEntity patientEntity4(){
        return PatientEntity.builder()
                .name("Ala")
                .surname("Alecka")
                .phone("4444444")
                .email("4444444@gmail.com")
                .pesel("4444444")
                .build();
    }
}
