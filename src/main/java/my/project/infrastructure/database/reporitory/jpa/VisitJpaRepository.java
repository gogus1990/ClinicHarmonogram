package my.project.infrastructure.database.reporitory.jpa;

import my.project.domain.Visit;
import my.project.infrastructure.database.entity.VisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitJpaRepository extends JpaRepository<VisitEntity, Integer> {

}
