package my.project.business;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.project.business.dao.DoctorDAO;
import my.project.domain.Doctor;
import my.project.domain.Exception.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
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
    public Doctor  findDoctorByPWZ(String pwz){
        Optional<Doctor> doctor = doctorDAO.findByEmail(pwz);
        if (doctor.isEmpty()){
            throw new NotFoundException("Could not find salesman by pwz: [%s]".formatted(pwz));
        }
        return doctor.get();
    }
    @Transactional
    public Doctor findDoctorByEmail(String email){
        Optional<Doctor> doctor = doctorDAO.findByEmail(email);
        if (doctor.isEmpty()){
            throw new NotFoundException("Could not find salesman by pesel: [%s]".formatted(email));
        }
        return doctor.get();
    }
}
