package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.business.dao.DoctorDAO;
import my.project.domain.Doctor;
import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.reporitory.jpa.DoctorJpaRepository;
import my.project.infrastructure.database.reporitory.mapper.DoctorEntityMapper;
import org.springframework.stereotype.Repository;

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
}
