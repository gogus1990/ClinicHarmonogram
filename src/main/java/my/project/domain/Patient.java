package my.project.domain;

import lombok.*;

import java.util.List;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "pesel")
@ToString(of = {"name", "surname", "pesel", "phone"})
public class Patient {

    Integer patientID;
    String name;
    String surname;
    String phone;
    String email;
    String pesel;

    List<Visit> visits;
}
