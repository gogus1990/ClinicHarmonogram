package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.infrastructure.database.reporitory.jpa.PatientJpaRepository;
import my.project.infrastructure.database.reporitory.mapper.PatientEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class PatientRepository {

    private final PatientJpaRepository patientJpaRepository;
    private final PatientEntityMapper patientEntityMapper;
}
