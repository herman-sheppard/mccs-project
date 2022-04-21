package io.embraceit.mccsproject.screen.ownership;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Ownership;

@UiController("mccs_Ownership.browse")
@UiDescriptor("ownership-browse.xml")
@LookupComponent("ownershipsTable")
public class OwnershipBrowse extends StandardLookup<Ownership> {
}