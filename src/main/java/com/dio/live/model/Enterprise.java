package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Enterprise {

    @Id
    private long id;
    private String description;
    private String numberPJ;
    private String address;
    private String county;
    private String city;
    private String state;
    private String phoneNumber;

}
