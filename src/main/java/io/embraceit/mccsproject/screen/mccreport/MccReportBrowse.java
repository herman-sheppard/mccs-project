package io.embraceit.mccsproject.screen.mccreport;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MccReport;

@UiController("mccs_MccReport.browse")
@UiDescriptor("mcc-report-browse.xml")
@LookupComponent("table")
public class MccReportBrowse extends MasterDetailScreen<MccReport> {
}