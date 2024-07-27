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
@Table(name = "doctor")
@EqualsAndHashCode(of = "doctorID")
@NamedNativeQueries(
        {
                @NamedNativeQuery(
                        name = "DoctorEntity.findAllWhereIdNNQ",
                        query = "SELECT * FROM doctor WHERE doctor_specialization = ?1",
                        resultClass = DoctorEntity.class
                )
        }
        )

public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long doctorID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "PWZ")
    private String pwz;

    @Column(name = "specialization")
    private String specialization;

    @OneToMany(mappedBy = "doctor")
    private List<AvailableDateEntity> availableDate;

    @OneToMany(mappedBy = "doctor")
    private List<VisitEntity> visits;
}
