package my.project.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
@EqualsAndHashCode(of = "doctorID")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Integer doctorID;

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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "doctorID", cascade = CascadeType.ALL)
    private Set<AvailableDateEntity> availableDateEntities;
}
