package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
//Essa classe contém um problema de chave composta, por isso será utilizado uma classe Embeddable!
@Entity
public class Movement {

    @Embeddable
    public class MovementId implements Serializable{
        private long idMov;
        private long idUser;
    }
    @EmbeddedId
    private MovementId id;
    private LocalDateTime enterDate;
    private LocalDateTime leaveDate;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private CalendarDated calendarDated;
}
