package my.project.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.project.business.dao.PatientDAO;
import my.project.domain.Patient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class PatientService {

    private final PatientDAO patientDAO;


@Transactional
    public Patient createNewPatient(Map<String, String> patientData){
        Patient patient = buildPatient(patientData);
        patientDAO.addPatientToDatabase(patient);
        return patient;
    }
    @Transactional
    public void deletePatient(String email){
        Optional<Patient> byEmail = patientDAO.findByEmail(email);

        if (byEmail.isEmpty()){
            throw new RuntimeException("Could not find patient with email: " + email);
        }
        Patient patient = byEmail.get();
        patientDAO.deletePatient(patient);
    }
    @Transactional
    public Patient updatePatientData(String email, Patient patient){
        Patient byEmail = findByEmail(email);

        byEmail.withName(patient.getName())
                .withSurname(patient.getSurname())
                .withEmail(patient.getEmail())
                .withPhone(patient.getPhone());

        patientDAO.addPatientToDatabase(byEmail);
        return byEmail;
    }
    @Transactional
    public Patient findByEmail(String email){
        Optional<Patient> byEmail = patientDAO.findByEmail(email);
        if (byEmail.isEmpty()){
            throw new RuntimeException("Could not find patient with email: " + email);
        }
        else {
            return byEmail.get();
        }

    }
    @Transactional
    public Patient findByPesel(String pesel){
        Optional<Patient> byPesel = patientDAO.findByPesel(pesel);
        if (byPesel.isEmpty()){
            throw new RuntimeException("Could not find patient with pesel: " + pesel);
        }
        else {
            return byPesel.get();
        }

    }











    Patient buildPatient(Map<String, String> patientData){
        return Patient.builder()
                .name(patientData.get("name"))
                .surname(patientData.get("surname"))
                .email(patientData.get("email"))
                .phone(patientData.get("phone"))
                .pesel(patientData.get("pesel"))
                .build();
    }
}
