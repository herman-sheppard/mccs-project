package io.embraceit.mccsproject.screen.mine;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Mine;

@UiController("mccs_Mine.edit")
@UiDescriptor("mine-edit.xml")
@EditedEntityContainer("mineDc")
public class MineEdit extends StandardEditor<Mine> {
}