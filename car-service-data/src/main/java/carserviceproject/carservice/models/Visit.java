package carserviceproject.carservice.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Visit extends BasicEntity {

    //@Temporal()
    private LocalDate dateVisit;
    private String description;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "serviceEmployee_id")
    private ServiceEmployee serviceEmployee;
}
