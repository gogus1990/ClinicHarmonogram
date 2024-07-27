package my.project.business.dao;

import my.project.domain.Patient;

import java.util.Optional;

public interface PatientDAO {

    Optional<Patient> findByPesel(String pesel);
    Optional<Patient> findByPhone(String phone);
    Optional<Patient> findByEmail(String email );

    void addPatientToDatabase(Patient patient);

    void deletePatient(Patient patient);

}
