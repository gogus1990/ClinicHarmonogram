package my.project.infrastructure.dataBase;

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
    @Column(name = "available_Date_id")
    private Integer available_DateID;

    @Column(name = "doctor_id")
    private Integer doctorID;

    @Column(name = "dateTime")
    private LocalDateTime dateTime;

    @Column(name = "availableDate")
    private Boolean availableDate;

}
