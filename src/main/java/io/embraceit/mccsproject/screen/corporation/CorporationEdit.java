package io.embraceit.mccsproject.screen.corporation;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Corporation;

@UiController("mccs_Corporation.edit")
@UiDescriptor("corporation-edit.xml")
@EditedEntityContainer("corporationDc")
public class CorporationEdit extends StandardEditor<Corporation> {
}