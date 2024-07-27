package my.project.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.project.business.dao.AvailableDateDAO;
import my.project.domain.AvailableDate;
import my.project.domain.Doctor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AvailableDataService {

    private final AvailableDateDAO availableDateDAO;

    @Transactional
    public List<AvailableDate> findAllAvailableData() {
        return availableDateDAO.findAllAvailable();
    }

    @Transactional
    public List<AvailableDate> findAllAvailableDataAvailable() {
        return availableDateDAO.findAllAvailableDataAvailable();
    }

    @Transactional
    public List<AvailableDate> findByDoctorID(Integer id) {
        return availableDateDAO.findByDoctorID(id);
    }

    @Transactional
    public List<AvailableDate> findBySpecialization(String specialization) {
        return availableDateDAO.findAllAvailableDataBySpec(specialization);
    }

    @Transactional
    public AvailableDate setReservation(Integer id) {
        AvailableDate availableDate = availableDateDAO.findByID(id).withAvailable(false);
        availableDateDAO.updateAvailable(availableDate);
        return availableDate;

    }

    @Transactional
    public AvailableDate addNewAvailableDate(LocalDateTime localDateTime, Doctor doctor) {
        return availableDateDAO.addNewAvailableDate(localDateTime, doctor);
    }

    @Transactional
    public void delete(Integer id) {
        availableDateDAO.deleteAvailableData(id);
    }


}
