package my.project.infrastructure.database.reporitory.mapper;

import my.project.domain.Doctor;
import my.project.domain.Patient;
import my.project.infrastructure.database.entity.DoctorEntity;
import my.project.infrastructure.database.entity.PatientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoctorEntityMapper {

    DoctorEntity mapToEntity(Doctor doctor);
    Doctor mapFormEntity(DoctorEntity doctorEntity);
}