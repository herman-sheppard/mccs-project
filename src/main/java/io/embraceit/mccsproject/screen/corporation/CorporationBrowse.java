package io.embraceit.mccsproject.screen.corporation;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Corporation;

@UiController("mccs_Corporation.browse")
@UiDescriptor("corporation-browse.xml")
@LookupComponent("corporationsTable")
public class CorporationBrowse extends StandardLookup<Corporation> {
}