package my.project.business;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.project.business.dao.DoctorDAO;
import my.project.domain.Doctor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class DoctorService {

    private final DoctorDAO doctorDAO;

    @Transactional
    public void addNewDoctorToDatabase(Doctor doctor){
        doctorDAO.addNewDoctorToDataBase(doctor);
    }

    @Transactional
    public List<Doctor> findAllDoctors(){
        return doctorDAO.findAllDoctors();
    }

    @Transactional
    Optional<Doctor> findByPWZ(String pwz){
        return doctorDAO.findByPWZ(pwz);
    }
    @Transactional
    Optional<Doctor> findByEmail(String email){
        return doctorDAO.findByEmail(email);
    }
}
