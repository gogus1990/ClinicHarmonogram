package my.project.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "availableDateID")
@ToString(of = {"availableDateID", "doctor_id", "visitDateTime", "available"})
public class AvailableDate {

    Integer availableDateID;
    Integer doctor_id;
    LocalDateTime visitDateTime;
    Boolean available;



}
