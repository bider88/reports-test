package com.astecitest.report.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ReportDTO implements Serializable {

    private Long id;
    private String description;
    private Integer status;
    private OperatorDTO operator;
    private DeviceDTO device;
    private Date createdAt;
    private Date updateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public OperatorDTO getOperator() {
        return operator;
    }

    public void setOperator(OperatorDTO operator) {
        this.operator = operator;
    }

    public DeviceDTO getDevice() {
        return device;
    }

    public void setDevice(DeviceDTO device) {
        this.device = device;
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
        ReportDTO reportDTO = (ReportDTO) o;
        return Objects.equals(id, reportDTO.id) && Objects.equals(description, reportDTO.description) && Objects.equals(status, reportDTO.status) && Objects.equals(operator, reportDTO.operator) && Objects.equals(device, reportDTO.device) && Objects.equals(createdAt, reportDTO.createdAt) && Objects.equals(updateAt, reportDTO.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, status, operator, device, createdAt, updateAt);
    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", operator=" + operator +
                ", device=" + device +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
