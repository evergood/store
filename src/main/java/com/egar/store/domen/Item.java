package com.egar.store.domen;

import lombok.Data;
import org.joda.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Item {
    @Id
    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;

    @OneToOne(mappedBy = "item")
    private OrderDetail orderDetail;

}
