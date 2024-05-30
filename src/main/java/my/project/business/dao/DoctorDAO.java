package my.project.business.dao;

import my.project.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorDAO {

    Optional<Doctor> findByEmail(String email);
    Optional<Doctor> findByPWZ(String pwz);


}
