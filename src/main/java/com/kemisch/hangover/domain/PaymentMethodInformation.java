package com.kemisch.hangover.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment_method_information")
public class PaymentMethodInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String value;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "payment_method")
    PaymentMethod paymentMethod;
}

// https://www.tutorialspoint.com/spring_security/spring_security_with_jwt.htm