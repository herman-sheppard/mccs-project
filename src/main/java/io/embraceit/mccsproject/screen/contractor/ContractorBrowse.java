package io.embraceit.mccsproject.screen.contractor;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Contractor;

@UiController("mccs_Contractor.browse")
@UiDescriptor("contractor-browse.xml")
@LookupComponent("contractorsTable")
public class ContractorBrowse extends StandardLookup<Contractor> {
}