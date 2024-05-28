package my.project.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "pesel")
@ToString(of = {"name", "surname", "pesel", "phone"})
public class Patient {

    Integer patientId;
    String name;
    String surname;
    String phone;
    String email;
    String pesel;

    Set<History> history;
}
