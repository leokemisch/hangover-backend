package com.kemisch.hangover.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("expense")
public class Expense extends Transaction {

    private static final long serialVersionUID = 1L;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "expense_type")
    ExpenseType expenseType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "payment_method")
    PaymentMethod paymentMethod;

    public Expense(Long id, String name, Double value, Date transactionDate, User user, String description) {
        super(id, name, value, transactionDate, user, description);
    }
}
