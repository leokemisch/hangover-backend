package com.kemisch.hangover.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "payment_method_information")
public class PaymentMethodInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String key;
    String value;

    @NotNull
    @ManyToOne
    PaymentMethod paymentMethod;
}

