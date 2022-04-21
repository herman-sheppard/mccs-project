package io.embraceit.mccsproject.screen.mine;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Mine;

@UiController("mccs_Mine.browse")
@UiDescriptor("mine-browse.xml")
@LookupComponent("minesTable")
public class MineBrowse extends StandardLookup<Mine> {
}