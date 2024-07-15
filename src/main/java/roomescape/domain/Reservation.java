package roomescape.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Table(name = "reservation")
public class Reservation {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private Time time;

    public Reservation(Long id, String name, String date, Time time){
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }
}
