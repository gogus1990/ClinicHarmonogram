package my.project.infrastructure.database.reporitory.mapper;

import my.project.domain.History;
import my.project.domain.Patient;
import my.project.infrastructure.database.entity.HistoryEntity;
import my.project.infrastructure.database.entity.PatientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PatientEntityMapper {


    PatientEntity mapToEntity(Patient patient);

    Patient mapFromEntity(PatientEntity patientEntity);
}