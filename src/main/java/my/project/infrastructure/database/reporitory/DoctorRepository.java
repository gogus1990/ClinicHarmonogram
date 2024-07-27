package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.business.dao.DoctorDAO;
import my.project.domain.Doctor;
import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.reporitory.jpa.DoctorJpaRepository;
import my.project.infrastructure.database.reporitory.mapper.DoctorEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class DoctorRepository implements DoctorDAO {

    private final DoctorJpaRepository doctorJpaRepository;
    private final DoctorEntityMapper doctorEntityMapper;


    @Override
    public Optional<Doctor> findByEmail(String email) {
        return doctorJpaRepository.findByEmail(email)
                .map(doctorEntityMapper::mapFormEntity);
    }

    @Override
    public Optional<Doctor> findByPWZ(String pwz) {
        return doctorJpaRepository.findByEmail(pwz)
                .map(doctorEntityMapper::mapFormEntity);
    }

    @Override
    public Optional<Doctor> findById(Integer id) {
        Optional<Doctor> doctor = doctorJpaRepository.findById(id)
                .map(doctorEntityMapper::mapFormEntity);
        return doctor;
    }

    @Override
    public List<Doctor> findBySpecialization(String specialization) {
        List<Doctor> list = doctorJpaRepository.findBySpecialization(specialization).stream()
                .map(doctorEntity -> doctorEntityMapper.mapFormEntity(doctorEntity))
                .toList();
        return list;

    }

    @Override
    public void delete(Integer id) {
        doctorJpaRepository.deleteById(id);
    }

    @Override
    public void updateDoctorData(Integer id, Doctor doctor) {
        doctorJpaRepository.deleteById(id);
        DoctorEntity doctorEntity = doctorEntityMapper.mapToEntity(doctor);
        doctorEntity.setDoctorID(id.longValue());

        doctorJpaRepository.save(doctorEntity);
    }

    @Override
    public void addDoctorToDatabase(Doctor doctor) {
        DoctorEntity doctorEntity = doctorEntityMapper.mapToEntity(doctor);
        doctorJpaRepository.save(doctorEntity);
    }


}
