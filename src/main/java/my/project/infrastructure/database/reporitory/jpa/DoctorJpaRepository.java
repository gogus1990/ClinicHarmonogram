package my.project.infrastructure.database.reporitory.jpa;

import my.project.domain.Doctor;
import my.project.infrastructure.database.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorJpaRepository extends JpaRepository<DoctorEntity, Integer> {

    Optional<DoctorEntity> findByEmail(String email);
    Optional<DoctorEntity> findByPWZ(String email);

    List<DoctorEntity> findAll();

   void addNewDoctorToDataBase(Doctor doctor);



}
