package io.embraceit.mccsproject.screen.mines;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Mines;

@UiController("mccs_Mines.browse")
@UiDescriptor("mines-browse.xml")
@LookupComponent("minesesTable")
public class MinesBrowse extends StandardLookup<Mines> {
}