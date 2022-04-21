package io.embraceit.mccsproject.screen.minecommunitydevelopment;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MineCommunityDevelopment;

@UiController("mccs_MineCommunityDevelopment.browse")
@UiDescriptor("mine-community-development-browse.xml")
@LookupComponent("mineCommunityDevelopmentsTable")
public class MineCommunityDevelopmentBrowse extends StandardLookup<MineCommunityDevelopment> {
}