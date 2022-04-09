package io.embraceit.mccsproject.screen.client;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Client;

@UiController("mccs_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}