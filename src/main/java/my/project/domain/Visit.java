package my.project.domain;

import lombok.*;

import java.time.LocalDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"visit", "patient"})
@ToString(of = {"visit", "patient"})
public class Visit {

    Long VisitID;
    Visit visit;
    Patient patient;
    String description;
}
