package io.embraceit.mccsproject.screen.states;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.States;

@UiController("mccs_States.browse")
@UiDescriptor("states-browse.xml")
@LookupComponent("statesesTable")
public class StatesBrowse extends StandardLookup<States> {
}