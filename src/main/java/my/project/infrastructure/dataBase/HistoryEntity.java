package my.project.infrastructure.dataBase;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient_history")
@EqualsAndHashCode(of = "patient_historyID")
public class HistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_history_id")
    private Integer patient_historyID;

    @Column(name = "visit_id")
    private Integer visitID;

    @Column(name = "patient_id")
    private Integer patientID;


}
