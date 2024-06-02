package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.domain.AvailableDate;
import my.project.infrastructure.database.reporitory.jpa.AvailableDateJpaRepository;
import my.project.infrastructure.database.reporitory.mapper.AvailableDateEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@AllArgsConstructor
public class AvailableDateRepository {

    private AvailableDateJpaRepository availableDateJpaRepository;
    private AvailableDateEntityMapper availableDateEntityMapper;


    public List<AvailableDate> findByDoctorID(List<Integer> ID) {
        return availableDateJpaRepository.findAllById(ID).stream()
                .map(availableDateEntityMapper::mapFromEntity)
                .toList();
    }


}
