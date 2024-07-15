package roomescape.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Table(name = "time")
public class Time {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "time")
    private String time;

    public Time(Long id, String time){
        this.id = id;
        this.time = time;
    }
}
