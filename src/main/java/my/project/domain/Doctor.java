package my.project.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "doctorID")
@ToString(of = {"name", "surname", "pwz", "specialization"})
public class Doctor {

    Integer doctorID;
    String name;
    String surname;
    String phone;
    String email;
    String pwz;
    String specialization;

    Set<AvailableDate> availableDates;
}
