package io.embraceit.mccsproject.screen.ownership;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Ownership;

@UiController("mccs_Ownership.edit")
@UiDescriptor("ownership-edit.xml")
@EditedEntityContainer("ownershipDc")
public class OwnershipEdit extends StandardEditor<Ownership> {
}