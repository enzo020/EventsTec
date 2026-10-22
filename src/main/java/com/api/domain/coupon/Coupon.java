package com.api.domain.coupon;

import com.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name= "coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue

    private UUID id;
    private Integer discont;
    private Date validade;

    @ManyToOne // Um evento pode ter varios cupons, e um cupom apenas a um evento
    @JoinColumn(name="event_id") //
    private Event event;
    //bloco que faz o join na tabela de eventos!
}
