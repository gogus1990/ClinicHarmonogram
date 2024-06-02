package my.project.infrastructure.database.reporitory.jpa;

import my.project.domain.Patient;
import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientJpaRepository extends JpaRepository<PatientEntity, Integer> {

    Optional<PatientEntity> findByPesel(String number);

    Optional<PatientEntity> findByEmail(String mail);

    Optional<PatientEntity> findByPhone(String number);
}
