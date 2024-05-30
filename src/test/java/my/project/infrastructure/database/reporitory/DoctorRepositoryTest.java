//package my.project.infrastructure.database.reporitory;
//
//import lombok.AllArgsConstructor;
//import my.project.infrastructure.database.reporitory.jpa.DoctorJpaRepository;
//import my.project.integration.PersistenceContainerTestConfiguration;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.TestPropertySource;
//
//@DataJpaTest
//@TestPropertySource(locations = "classpath:application-test.yml")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Import(PersistenceContainerTestConfiguration.class)
//@AllArgsConstructor(onConstructor = @__(@Autowired))
//class DoctorRepositoryTest {
//
////    private DoctorJpaRepository doctorJpaRepository;
//
//    @Test
//    void addToDatabaseCorrectly(){
////        doctorJpaRepository.addNewDoctorToDataBase(SimpleDoctor.doctor1());
////        doctorJpaRepository.addNewDoctorToDataBase(SimpleDoctor.doctor2());
////
////
////
////
////        List<DoctorEntity> allDoctors = doctorJpaRepository.findAll();
////
////        Assertions.assertEquals(2, allDoctors.size());
//
//    }
//
//    @Test
//    void findByPWZ(){
////        Doctor doctor1 = SimpleDoctor.doctor3();
////        doctorJpaRepository.addNewDoctorToDataBase(doctor1);
////
////        Optional<DoctorEntity> byPWZ = doctorJpaRepository.findByPWZ("333333333");
////
////        Assertions.assertEquals(doctor1.getPwz(),byPWZ.get().getPwz() );
////        Assertions.assertEquals(doctor1.getEmail(),byPWZ.get().getEmail() );
////
//
//    }
//    @Test
//    void findByEmail(){
////        Doctor doctor1 = SimpleDoctor.doctor4();
////        doctorJpaRepository.addNewDoctorToDataBase(doctor1);
////
////        Optional<DoctorEntity> byPWZ = doctorJpaRepository.findByEmail("dasdsad@dasasd.pl");
////        Assertions.assertEquals(doctor1.getPwz(),byPWZ.get().getPwz() );
////        Assertions.assertEquals(doctor1.getEmail(),byPWZ.get().getEmail() );
////
//
//    }
//
//}