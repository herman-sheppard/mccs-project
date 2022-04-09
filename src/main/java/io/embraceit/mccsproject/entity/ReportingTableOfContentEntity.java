package io.embraceit.mccsproject.entity;

import io.embraceit.mccsproject.entity.enums.Sectors;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@JmixEntity(name = "mccs_ReportingTableOfContentEntity")
@Embeddable
public class ReportingTableOfContentEntity {
    @InstanceName
    @Column(name = "REPORT_NAME", nullable = false)
    @NotNull
    private String reportName;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "SECTOR_NAME")
    private String sectorName;

    @Column(name = "MINE_NAME")
    private String mineName;

    @Column(name = "MINING_RIGHTS_FILE_NUMBER")
    private String miningRightsFileNumber;

    @Column(name = "MINE_CODE")
    private String mineCode;

    @Column(name = "COMMODITY")
    private String commodity;

    @Column(name = "TOC_HEADING", nullable = false)
    @NotNull
    private String tocHeading;

    @Column(name = "TOC_SUBHEADING")
    private String tocSubheading;

    public void setTocSubheading(String tocSubheading) {
        this.tocSubheading = tocSubheading;
    }

    public String getTocSubheading() {
        return tocSubheading;
    }

    public String getTocHeading() {
        return tocHeading;
    }

    public void setTocHeading(String tocHeading) {
        this.tocHeading = tocHeading;
    }

    public Sectors getCommodity() {
        return commodity == null ? null : Sectors.fromId(commodity);
    }

    public void setCommodity(Sectors commodity) {
        this.commodity = commodity == null ? null : commodity.getId();
    }

    public String getMineCode() {
        return mineCode;
    }

    public void setMineCode(String mineCode) {
        this.mineCode = mineCode;
    }

    public String getMiningRightsFileNumber() {
        return miningRightsFileNumber;
    }

    public void setMiningRightsFileNumber(String miningRightsFileNumber) {
        this.miningRightsFileNumber = miningRightsFileNumber;
    }

    public String getMineName() {
        return mineName;
    }

    public void setMineName(String mineName) {
        this.mineName = mineName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }
}