package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.domain.Exception.NotFoundException;
import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.reporitory.jpa.DoctorJpaRepository;
import my.project.integration.PersistenceContainerTestConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Optional;

import static util.SimpleDoctor.*;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PersistenceContainerTestConfiguration.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class DoctorRepositoryTest {

    private DoctorJpaRepository doctorJpaRepository;


    @Test
    void findByEmail() {
        Optional<DoctorEntity> byEmail = doctorJpaRepository.findByEmail("colivas4@sohu.com");
        Assertions.assertEquals("5100170165974410", byEmail.get().getPwz());
        Assertions.assertEquals("colivas4@sohu.com", byEmail.get().getEmail());


    }

    @Test
    void findByPWZ() {
        DoctorEntity doctor1 = doctor3();
        doctorJpaRepository.save(doctor1);

        Optional<DoctorEntity> byPWZ = doctorJpaRepository.findByPwz("333333333");
        Assertions.assertEquals(doctor1.getPwz(), byPWZ.get().getPwz());
        Assertions.assertEquals(doctor1.getEmail(), byPWZ.get().getEmail());


    }

    @Test
    void addCorrectly() {
        doctorJpaRepository.save(doctor1());
        doctorJpaRepository.save(doctor2());
        doctorJpaRepository.save(doctor3());
        doctorJpaRepository.save(doctor4());

        List<DoctorEntity> all = doctorJpaRepository.findAll();

        Assertions.assertEquals(9, all.size());

    }

}