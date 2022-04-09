package io.embraceit.mccsproject.screen.mccsuser;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MccsUser;

@UiController("mccs_MccsUser.edit")
@UiDescriptor("mccs-user-edit.xml")
@EditedEntityContainer("mccsUserDc")
public class MccsUserEdit extends StandardEditor<MccsUser> {
}