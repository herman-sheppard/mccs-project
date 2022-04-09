package io.embraceit.mccsproject.screen.client;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Client;

@UiController("mccs_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {
}