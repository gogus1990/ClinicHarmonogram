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
    private Integer visitID;

    @Column(name = "availableDate_id")
    private LocalDateTime availableDateID;

    @Column(name = "patient_id")
    private Integer patientID;


}