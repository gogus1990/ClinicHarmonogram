package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.business.dao.PatientDAO;
import my.project.domain.Patient;
import my.project.infrastructure.database.reporitory.jpa.PatientJpaRepository;
import my.project.infrastructure.database.reporitory.mapper.PatientEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PatientRepository implements PatientDAO {

    private final PatientJpaRepository patientJpaRepository;
    private final PatientEntityMapper patientEntityMapper;

    @Override
    public Optional<Patient> findByPesel(String pesel) {
        return patientJpaRepository.findByPesel(pesel)
                .map(patientEntityMapper::mapFromEntity);
    }

    @Override
    public Optional<Patient> findByPhone(String phone) {
        return patientJpaRepository.findByPhone(phone)
                .map(patientEntityMapper::mapFromEntity);
    }

    @Override
    public Optional<Patient> findByEmail(String email) {
        return patientJpaRepository.findByEmail(email)
                .map(patientEntityMapper::mapFromEntity);
    }

    @Override
    public void addPatientToDatabase(Patient patient) {
        patientJpaRepository.saveAndFlush(patientEntityMapper.mapToEntity(patient));
    }

    @Override
    public void deletePatient(Patient patient) {
        patientJpaRepository.deleteById(patient.getPatientID());
    }
}
