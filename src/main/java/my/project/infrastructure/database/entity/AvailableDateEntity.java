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
@Table(name = "available_Date")
@EqualsAndHashCode(of = "available_DateID")
public class AvailableDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "availableDate_id")
    private Integer available_DateID;

    @Column(name = "dateTime")
    private LocalDateTime dateTime;


    @Column(name = "availableDate")
    private Boolean available;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctorID;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "availableDateEntity", cascade = CascadeType.ALL)
    private VisitEntity visitEntity;
}


