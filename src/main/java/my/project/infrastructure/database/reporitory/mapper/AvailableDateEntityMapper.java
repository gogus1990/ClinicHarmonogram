package my.project.infrastructure.database.reporitory.mapper;

import my.project.domain.AvailableDate;
import my.project.infrastructure.database.entity.AvailableDateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AvailableDateEntityMapper {

    AvailableDateEntity mapToEntity(AvailableDate availableDate);
}