package my.project.infrastructure.dataBase;

import jakarta.persistence.*;
import lombok.*;

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
    private Integer availableDateID;

    @Column(name = "patient_id")
    private Integer patientID;


}
