package my.project.infrastructure.database.reporitory.mapper;

import my.project.domain.AvailableDate;
import my.project.domain.History;
import my.project.infrastructure.database.entity.AvailableDateEntity;
import my.project.infrastructure.database.entity.HistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HistoryEntityMapper {

    HistoryEntity mapToEntity(History history);
}