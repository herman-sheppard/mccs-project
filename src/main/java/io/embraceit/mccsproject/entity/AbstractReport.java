package io.embraceit.mccsproject.entity;

import io.jmix.core.annotation.TenantId;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@JmixEntity(name = "mccs_AbstractReport")
@MappedSuperclass
public class AbstractReport extends ReportingEntity {
    @Column(name = "REPORT_LEVEL")
    private String reportLevel;

    @TenantId
    @Column(name = "TENANT")
    private String tenant;

    public ReportLevel getReportLevel() {
        return reportLevel == null ? null : ReportLevel.fromId(reportLevel);
    }

    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel == null ? null : reportLevel.getId();
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
}