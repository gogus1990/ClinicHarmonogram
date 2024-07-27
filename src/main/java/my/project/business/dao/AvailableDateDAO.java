package my.project.business.dao;

import my.project.domain.AvailableDate;
import my.project.domain.Doctor;

import java.time.LocalDateTime;
import java.util.List;

public interface AvailableDateDAO {

    List<AvailableDate> findByDoctorID(Integer id);

    List<AvailableDate> findAllAvailableDataBySpec(String specialization);

    List<AvailableDate> findAllAvailable();

    List<AvailableDate> findAllAvailableDataAvailable();

    AvailableDate findByID(Integer id);

    void updateAvailable(AvailableDate availableDate);

    AvailableDate addNewAvailableDate(LocalDateTime availableDate, Doctor doctor);

    void deleteAvailableData(Integer id);
}
