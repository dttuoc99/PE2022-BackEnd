package com.javatechie.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Data
@NoArgsConstructor
@ToString
@Entity
public class Drug {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "drug_sequence",
            sequenceName = "drug_sequence",
            allocationSize = 1 //increment by 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "drug_sequence"
    )
    private Long id;
    //@Column(nullable = false)
    private String drugName;
    //@Column(nullable = false)
    private Date manufacturingDate;
    //@Column(nullable = false)
    private Date expiredDate;
    //@Column(nullable = false)
    private String type;
    private int price;


    @ManyToOne
    @JoinColumn(name = "drugSupplierID", nullable = true)
    private DrugSupplier drugSupplier;



    public Drug(Long id, String drugName, Date manufacturingDate, Date expiredDate, String type, int price, DrugSupplier drugSupplier) {
        this.id = id;
        this.drugName = drugName;
        this.manufacturingDate = manufacturingDate;
        this.expiredDate = expiredDate;
        this.type = type;
        this.price = price;
        this.drugSupplier = drugSupplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DrugSupplier getDrugSupplier() {
        return drugSupplier;
    }

    public void setDrugSupplier(DrugSupplier drugSupplier) {
        this.drugSupplier = drugSupplier;
    }
}
