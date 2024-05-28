package my.project.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"visitID", "patientID"})
@ToString(of = {"visitID", "patientID"})
public class History {
    int visitID;
    int patientID;
}
