package my.project.infrastructure.database.reporitory.mapper;

import my.project.domain.History;
import my.project.domain.Visit;
import my.project.infrastructure.database.entity.HistoryEntity;
import my.project.infrastructure.database.entity.VisitEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VisitEntityMapper {

    VisitEntity mapToEntity(Visit visit);
}