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
@EqualsAndHashCode(of = "available_date_id")
@NamedNativeQueries(
        {
                @NamedNativeQuery(
                        name = "AvailableDateEntity.findAllWhereIdNNQ",
                        query = "SELECT * FROM available_Date WHERE doctor_id = ?1",
                        resultClass = AvailableDateEntity.class
                ),

                @NamedNativeQuery(
                        name = "AvailableDateEntity.findAllAvailableNNQ",
                        query = "SELECT * FROM available_Date WHERE availabledate = true",
                        resultClass = AvailableDateEntity.class
                ),

                @NamedNativeQuery(
                        name = "AvailableDateEntity.findAllAvailableBySpecNNQ",
                        query = """
                                select * from available_date as available
                                inner join doctor doc on available.doctor_id = doc.doctor_id
                                where doc.specialization = ?1
                                """,
                        resultClass = AvailableDateEntity.class
                )
        }
)
public class AvailableDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "available_date_id")
    private Long available_date_id;



    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;


    @Column(name = "date_time")
    private LocalDateTime dateVisit;


    @Column(name = "availableDate")
    private Boolean empty;


    @OneToOne(mappedBy = "availableDate")
    private VisitEntity visit;
}


