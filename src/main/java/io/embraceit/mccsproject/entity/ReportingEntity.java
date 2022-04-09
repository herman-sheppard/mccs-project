package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@JmixEntity(name = "mccs_ReportingEntity")
@MappedSuperclass
public class ReportingEntity extends StandardEntity {
    @Column(name = "REPORT_START_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportStartDate;

    @Column(name = "REPORT_END_DATE")
    private String reportEndDate;

    @NotNull
    @InstanceName
    @Column(name = "REPORT_NAME", nullable = false)
    private String reportName;

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportEndDate() {
        return reportEndDate;
    }

    public void setReportEndDate(String reportEndDate) {
        this.reportEndDate = reportEndDate;
    }

    public Date getReportStartDate() {
        return reportStartDate;
    }

    public void setReportStartDate(Date reportStartDate) {
        this.reportStartDate = reportStartDate;
    }
}