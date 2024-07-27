package my.project.infrastructure.database.reporitory.jpa;

import my.project.infrastructure.database.entity.AvailableDateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvailableDateJpaRepository extends JpaRepository<AvailableDateEntity, Integer> {

    List<AvailableDateEntity> findAllWhereIdNNQ(Integer ID);

    List<AvailableDateEntity> findAllAvailableNNQ();

    List<AvailableDateEntity> findAllAvailableBySpecNNQ(String specialization);


}
