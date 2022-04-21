package io.embraceit.mccsproject.screen.hrdevelopment;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.HRDevelopment;

@UiController("mccs_HRDevelopment.browse")
@UiDescriptor("hr-development-browse.xml")
@LookupComponent("hRDevelopmentsTable")
public class HRDevelopmentBrowse extends StandardLookup<HRDevelopment> {
}