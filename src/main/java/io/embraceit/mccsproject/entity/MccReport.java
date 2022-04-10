package io.embraceit.mccsproject.entity;

import io.jmix.core.entity.annotation.EmbeddedParameters;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "MCCS_MCC_REPORT")
@Entity(name = "mccs_MccReport")
public class MccReport extends AbstractReport {
    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "reportName", column = @Column(name = "TABLE_OF_CONTENTS_REPORT_NAME")),
            @AttributeOverride(name = "companyName", column = @Column(name = "TABLE_OF_CONTENTS_COMPANY_NAME")),
            @AttributeOverride(name = "sectorName", column = @Column(name = "TABLE_OF_CONTENTS_SECTOR_NAME")),
            @AttributeOverride(name = "mineName", column = @Column(name = "TABLE_OF_CONTENTS_MINE_NAME")),
            @AttributeOverride(name = "miningRightsFileNumber", column = @Column(name = "TABLE_OF_CONTENTS_MINING_RIGHTS_FILE_NUMBER")),
            @AttributeOverride(name = "mineCode", column = @Column(name = "TABLE_OF_CONTENTS_MINE_CODE")),
            @AttributeOverride(name = "commodity", column = @Column(name = "TABLE_OF_CONTENTS_COMMODITY")),
            @AttributeOverride(name = "tocHeading", column = @Column(name = "TABLE_OF_CONTENTS_TOC_HEADING")),
            @AttributeOverride(name = "tocSubheading", column = @Column(name = "TABLE_OF_CONTENTS_TOC_SUBHEADING"))
    })
    private ReportingTableOfContentEntity tableOfContents;

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    private ReportingScoreCardEntity reportScorecard;

    public ReportingScoreCardEntity getReportScorecard() {
        return reportScorecard;
    }

    public void setReportScorecard(ReportingScoreCardEntity reportScorecard) {
        this.reportScorecard = reportScorecard;
    }

    public ReportingTableOfContentEntity getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(ReportingTableOfContentEntity tableOfContents) {
        this.tableOfContents = tableOfContents;
    }
}