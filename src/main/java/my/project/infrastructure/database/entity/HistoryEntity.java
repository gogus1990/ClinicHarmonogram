package my.project.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;
import my.project.domain.Visit;

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

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "visit_id")
    private VisitEntity visit;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;


}
