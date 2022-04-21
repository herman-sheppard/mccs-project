package io.embraceit.mccsproject.screen.hrdevelopment;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.HRDevelopment;

@UiController("mccs_HRDevelopment.edit")
@UiDescriptor("hr-development-edit.xml")
@EditedEntityContainer("hRDevelopmentDc")
public class HRDevelopmentEdit extends StandardEditor<HRDevelopment> {
}