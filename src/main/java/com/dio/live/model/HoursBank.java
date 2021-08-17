package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HoursBank {

    @Embeddable
    public class HoursBankId implements Serializable{
        private long idBan;
        private long idMov;
        private long idUsr;
    }

    @EmbeddedId
    private HoursBankId id;
    private LocalDateTime dateWorked;
    private BigDecimal hourQuantity;
    private BigDecimal hourBalance;
}
