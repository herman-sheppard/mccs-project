package io.embraceit.mccsproject.screen.countries;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Countries;

@UiController("mccs_Countries.browse")
@UiDescriptor("countries-browse.xml")
@LookupComponent("countriesesTable")
public class CountriesBrowse extends StandardLookup<Countries> {
}