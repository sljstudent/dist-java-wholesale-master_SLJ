package edu.wctc.wholesale.entity;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @Column(name = "customer_id")
    private int id;

    @Column(name = "name")
    private String name;
}
