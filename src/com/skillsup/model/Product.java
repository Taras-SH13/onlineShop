package com.skillsup.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String name;
    private long id;
    private BigDecimal cost;
    private long amount;
    private String description;
    private String category;

    public Product(String name, long id, BigDecimal cost, long amount, String description, String category) {
        this.name = name;
        this.id = id;
        this.cost = cost;
        this.amount = amount;
        this.description = description;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public long getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}

