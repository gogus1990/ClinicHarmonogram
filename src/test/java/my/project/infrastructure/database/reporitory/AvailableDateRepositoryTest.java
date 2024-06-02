package my.project.infrastructure.database.reporitory;

import lombok.AllArgsConstructor;
import my.project.infrastructure.database.entity.AvailableDateEntity;
import my.project.infrastructure.database.reporitory.jpa.AvailableDateJpaRepository;
import my.project.integration.PersistenceContainerTestConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PersistenceContainerTestConfiguration.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class AvailableDateRepositoryTest {

    private AvailableDateJpaRepository availableDateJpaRepository;

    @Test
    void foundAllAvailableDate(){
        List<AvailableDateEntity> allWhereIdNNQ = availableDateJpaRepository.findAllWhereIdNNQ(111);
        allWhereIdNNQ.forEach(System.out::println);

        Assertions.assertEquals(2, allWhereIdNNQ.size());

    }

}