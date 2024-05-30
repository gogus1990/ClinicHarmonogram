package my.project.infrastructure.database.reporitory.jpa;

import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryJpaRepository extends JpaRepository<HistoryEntity, Integer> {

}
