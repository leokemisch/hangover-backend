package com.kemisch.hangover.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@JsonTypeName("Input")
public class Input extends Transaction {

    private static final long serialVersionUID = 1L;

    InputType inputType;

    public Input(Long id, String name, Double value, Date transactionDate, User user, String description) {
        super(id, name, value, transactionDate, user, description);
    }
}
