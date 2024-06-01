package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.infrastructure.database.entity.PatientEntity;
import my.project.infrastructure.database.reporitory.jpa.PatientJpaRepository;
import my.project.integration.PersistenceContainerTestConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static util.ExamplePatient.*;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PersistenceContainerTestConfiguration.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class PatientRepositoryTest {


    private final PatientJpaRepository patientJpaRepository;


    @Test
    void findCorrectlyByPesel() {

        List<PatientEntity> patientEntities = List.of(patientEntity1(), patientEntity2(), patientEntity3(), patientEntity4());

        List<PatientEntity> patientEntityList = new ArrayList<>();

        Assertions.assertEquals(0, patientEntityList.size());

        patientJpaRepository.saveAll(patientEntities);

        Optional<PatientEntity> byPesel = patientJpaRepository.findByPesel("2222222");

        List<PatientEntity> all = patientJpaRepository.findAll();


        Assertions.assertEquals(patientEntity2().getPesel(), byPesel.get().getPesel());

    }

    @Test
    void findCorrectlyByEmail() {
        List<PatientEntity> patientEntities = List.of(patientEntity1(), patientEntity2(), patientEntity3(), patientEntity4());

        List<PatientEntity> patientEntityList = new ArrayList<>();

        Assertions.assertEquals(0, patientEntityList.size());

        patientJpaRepository.saveAll(patientEntities);

        Optional<PatientEntity> byPesel = patientJpaRepository.findByEmail("3333333@gmail.com");


        Assertions.assertEquals(patientEntity3().getPesel(), byPesel.get().getPesel());

    }

    @Test
    void findCorrectlyByPhone() {
        List<PatientEntity> patientEntities = List.of(patientEntity1(), patientEntity2(), patientEntity3(), patientEntity4());

        List<PatientEntity> patientEntityList = new ArrayList<>();

        Assertions.assertEquals(0, patientEntityList.size());

        patientJpaRepository.saveAll(patientEntities);

        Optional<PatientEntity> byPesel = patientJpaRepository.findByPhone("4444444");


        Assertions.assertEquals(patientEntity4().getPesel(), byPesel.get().getPesel());

    }
}