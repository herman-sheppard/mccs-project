package io.embraceit.mccsproject.screen.contractor;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Contractor;

@UiController("mccs_Contractor.edit")
@UiDescriptor("contractor-edit.xml")
@EditedEntityContainer("contractorDc")
public class ContractorEdit extends StandardEditor<Contractor> {
}