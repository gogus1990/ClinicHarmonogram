package my.project.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visit")
@EqualsAndHashCode(of = "visitID")
public class VisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_id")
    private Long visitID;

    @Column(name = "description")
    private String description;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;


    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;



    @OneToOne
    @JoinColumn(name = "available_date_id")
    private AvailableDateEntity availableDate;
}
