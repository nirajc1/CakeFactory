package com.example.CakeFactory.model;
import javax.persistence.*;

@Entity
@Table(name ="Cake")
public class Cake
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    @Column(name="CakeName")
    private String CakeName="Milk Cake";
    @Column(name="Falvour")
    private String Falvour;
    @Column(name="Price")
    private Double Price;
    @Column(name="Size")
    private Integer Size;
    @Column(name="Description")
    private String Description;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCakeName() {
        return CakeName;
    }

    public void setCakeName(String cakeName) {
        CakeName = cakeName;
    }

    public String getFalvour() {
        return Falvour;
    }

    public void setFalvour(String falvour) {
        Falvour = falvour;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }



}

