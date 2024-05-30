package my.project.infrastructure.database.reporitory.jpa;

import my.project.domain.Patient;
import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientJpaRepository extends JpaRepository<PatientEntity, Integer> {

}
