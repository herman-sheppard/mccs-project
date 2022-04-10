package io.embraceit.mccsproject.screen.cities;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Cities;

@UiController("mccs_Cities.browse")
@UiDescriptor("cities-browse.xml")
@LookupComponent("citiesesTable")
public class CitiesBrowse extends StandardLookup<Cities> {
}