package my.project.business;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.project.business.dao.AvailableDateDAO;
import my.project.business.dao.DoctorDAO;
import my.project.domain.AvailableDate;
import my.project.domain.Doctor;
import my.project.domain.Exception.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class DoctorService {

    private final DoctorDAO doctorDAO;


    @Transactional
    public Doctor findDoctorByPWZ(String pwz) {
        Optional<Doctor> doctor = doctorDAO.findByPWZ(pwz);
        if (doctor.isEmpty()) {
            throw new NotFoundException("Could not find doctor by pwz: [%s]".formatted(pwz));
        }
        return doctor.get();
    }

    @Transactional
    public Doctor findDoctorByEmail(String email) {
        Optional<Doctor> doctor = doctorDAO.findByEmail(email);
        if (doctor.isEmpty()) {
            throw new NotFoundException("Could not find doctor by pesel: [%s]".formatted(email));
        }
        return doctor.get();
    }
    @Transactional
    public List<Doctor> findBySpecialization(String specialization){
        List<Doctor> bySpecialization = doctorDAO.findBySpecialization(specialization);
        if (bySpecialization.isEmpty()){
            throw new NotFoundException("Could not find doctor's by specialization: [%s]".formatted(specialization));
        }
        return bySpecialization;
    }

    @Transactional
    public Doctor addDoctorToDatabase(Map<String, String> doctor) {
        Doctor doctorBuild = buildDoctorBasic(doctor);
        doctorDAO.addDoctorToDatabase(doctorBuild);
        return doctorBuild;

    }

    @Transactional
    void deleteDoctor(Integer id){
        doctorDAO.delete(id);
    }



    private static Doctor buildDoctorBasic(Map<String, String> doctor) {
        Doctor doctorBuild = Doctor.builder()
                .name(doctor.get("name"))
                .surname(doctor.get("surname"))
                .phone(doctor.get("phone"))
                .email(doctor.get("email"))
                .pwz(doctor.get("pwz"))
                .specialization(doctor.get("specialization"))
                .build();
        return doctorBuild;
    }
}
