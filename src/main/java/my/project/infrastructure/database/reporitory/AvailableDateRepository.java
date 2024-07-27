package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.business.dao.AvailableDateDAO;
import my.project.domain.AvailableDate;
import my.project.domain.Doctor;
import my.project.infrastructure.database.entity.AvailableDateEntity;
import my.project.infrastructure.database.reporitory.jpa.AvailableDateJpaRepository;
import my.project.infrastructure.database.reporitory.mapper.AvailableDateEntityMapper;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@AllArgsConstructor
public class AvailableDateRepository implements AvailableDateDAO {

    private AvailableDateJpaRepository availableDateJpaRepository;
    private AvailableDateEntityMapper availableDateEntityMapper;

    @Override
    public List<AvailableDate> findByDoctorID(Integer id) {
        return availableDateJpaRepository.findAllWhereIdNNQ(id).stream()
                .map(availableDateEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public List<AvailableDate> findAllAvailableDataAvailable() {
        return availableDateJpaRepository.findAllAvailableNNQ().stream()
                .map(availableDateEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public AvailableDate findByID(Integer id) {
        AvailableDateEntity availableDateEntity = availableDateJpaRepository.findById(id).get();
        AvailableDate availableDate = availableDateEntityMapper.mapFromEntity(availableDateEntity);
        return availableDate;
    }

    @Override
    public void updateAvailable(AvailableDate availableDate) {
        AvailableDateEntity availableDateEntity = availableDateEntityMapper.mapToEntity(availableDate);
        availableDateJpaRepository.saveAndFlush(availableDateEntity);
    }

    @Override
    public List<AvailableDate> findAllAvailableDataBySpec(String specialization) {
        return availableDateJpaRepository.findAllAvailableBySpecNNQ(specialization).stream()
                .map(availableDateEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public List<AvailableDate> findAllAvailable() {
        return availableDateJpaRepository.findAll().stream()
                .map(availableDateEntityMapper::mapFromEntity)
                .toList();
    }


    @Override
    public AvailableDate addNewAvailableDate(LocalDateTime availableDate, Doctor doctor) {
        AvailableDate available = AvailableDate.builder()
                .visitDateTime(availableDate)
                .doctor_id(doctor.getDoctorID())
                .available(true)
                .build();
        availableDateJpaRepository.save(availableDateEntityMapper.mapToEntity(available));
        return available;
    }

    @Override
    public void deleteAvailableData(Integer id) {
        availableDateJpaRepository.deleteById(id);
    }
}



