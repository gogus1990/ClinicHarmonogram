package my.project.business.dao;

import my.project.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorDAO {

    Optional<Doctor> findByEmail(String email);
    Optional<Doctor> findByPWZ(String pwz);

    void addDoctorToDatabase(Doctor doctor);

    Optional<Doctor> findById(Integer id);

    List<Doctor> findBySpecialization(String specialization);

    void delete(Integer id);

    void updateDoctorData(Integer id, Doctor doctor);

}
