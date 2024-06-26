package my.project.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;
import my.project.domain.Visit;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
@EqualsAndHashCode(of = "patientID")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "pesel")
    private String pesel;

    @OneToMany(mappedBy = "patient")
    private List<VisitEntity> visit;
}
