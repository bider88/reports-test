package com.astecitest.report.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class DeviceDTO implements Serializable {

    private Long id;
    private String model;
    private String type;
    private String brand;
    private Date createdAt;
    private Date updateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceDTO deviceDTO = (DeviceDTO) o;
        return Objects.equals(id, deviceDTO.id) && Objects.equals(model, deviceDTO.model) && Objects.equals(type, deviceDTO.type) && Objects.equals(brand, deviceDTO.brand) && Objects.equals(createdAt, deviceDTO.createdAt) && Objects.equals(updateAt, deviceDTO.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, type, brand, createdAt, updateAt);
    }

    @Override
    public String toString() {
        return "DeviceDTO{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
