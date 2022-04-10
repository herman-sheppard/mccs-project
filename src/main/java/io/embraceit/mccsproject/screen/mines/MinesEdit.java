package io.embraceit.mccsproject.screen.mines;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Mines;

@UiController("mccs_Mines.edit")
@UiDescriptor("mines-edit.xml")
@EditedEntityContainer("minesDc")
public class MinesEdit extends StandardEditor<Mines> {
}