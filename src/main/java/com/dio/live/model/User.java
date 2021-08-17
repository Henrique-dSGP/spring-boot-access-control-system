package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {
    @Id
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkJourney workJourney;
    private BigDecimal tolerance;
    private LocalDateTime timeStartJourney;
    private LocalDateTime timeEndJourney;
}
