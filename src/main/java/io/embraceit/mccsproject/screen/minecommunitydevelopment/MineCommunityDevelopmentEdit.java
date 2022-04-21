package io.embraceit.mccsproject.screen.minecommunitydevelopment;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MineCommunityDevelopment;

@UiController("mccs_MineCommunityDevelopment.edit")
@UiDescriptor("mine-community-development-edit.xml")
@EditedEntityContainer("mineCommunityDevelopmentDc")
public class MineCommunityDevelopmentEdit extends StandardEditor<MineCommunityDevelopment> {
}