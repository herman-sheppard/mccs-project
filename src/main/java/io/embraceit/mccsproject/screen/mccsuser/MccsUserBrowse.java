package io.embraceit.mccsproject.screen.mccsuser;

import io.embraceit.mccsproject.app.DataGridDetailsGeneratorService;
import io.jmix.core.MetadataTools;
import io.jmix.ui.UiComponents;
import io.jmix.ui.action.BaseAction;
import io.jmix.ui.component.*;
import io.jmix.ui.download.Downloader;
import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MccsUser;
import io.jmix.ui.screen.LookupComponent;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

@UiController("mccs_MccsUser.browse")
@UiDescriptor("mccs-user-browse.xml")
@LookupComponent("mccsUsersTable")
public class MccsUserBrowse extends StandardLookup<MccsUser> {

    @Autowired
    protected DataGrid<MccsUser> mccsUsersTable;

    @Autowired
    protected UiComponents uiComponents;
    @Autowired
    protected DataGridDetailsGeneratorService service;
    @Autowired
    protected MetadataTools metadataTools;

    @Autowired
    private Downloader downloader;


    @Subscribe
    public void onInit(InitEvent event) {
        mccsUsersTable.setItemClickAction(new BaseAction("itemClickAction")
                .withHandler(actionPerformedEvent ->
                        mccsUsersTable.setDetailsVisible(Objects.requireNonNull(mccsUsersTable.getSingleSelected()), true)));
    }

    @Install(to = "mccsUsersTable.profileImage", subject = "columnGenerator")
    private @NotNull Component mccsUsersTablProfileImageColumnGenerator(@NotNull MccsUser mccsUser) {
        if (mccsUser.getProfileImage() != null) {
            LinkButton linkButton = uiComponents.create(LinkButton.class);
            linkButton.setAction(new BaseAction("download")
                    .withCaption(mccsUser.getProfileImage().getFileName())
                    .withHandler(actionPerformedEvent ->
                            downloader.download(mccsUser.getProfileImage())
                    )
            );
            return linkButton;
        } else {
            return new Table.PlainTextCell("<empty>");
        }
    }

    @Install(to = "mccsUsersTable", subject = "detailsGenerator")
    protected Component ordersDataGridDetailsGenerator(MccsUser mccsUser) {
        VBoxLayout mainLayout = uiComponents.create(VBoxLayout.class);
        mainLayout.setWidth("100%");
        mainLayout.setMargin(true);

        HBoxLayout headerBox = uiComponents.create(HBoxLayout.class);
        headerBox.setWidth("100%");

        Label<String> infoLabel = uiComponents.create(Label.TYPE_STRING);
        infoLabel.setHtmlEnabled(true);
        infoLabel.setStyleName("h1");
        infoLabel.setValue("User info:");

        Component closeButton = createCloseButton(mccsUser);
        headerBox.add(infoLabel);
        headerBox.add(closeButton);
        headerBox.expand(infoLabel);

        Component content = getContent(mccsUser);

        mainLayout.add(headerBox);
        mainLayout.add(content);
        mainLayout.expand(content);

        return mainLayout;
    }

    protected Component getContent(MccsUser entity) {
        Label<String> content = uiComponents.create(Label.TYPE_STRING);
        content.setHtmlEnabled(true);
        content.setId("contentLabel");

        StringBuilder sb = new StringBuilder();
        sb.append("<table cellspacing=3px cellpadding=3px>")
                .append("<tr>")
                .append("<th>Street</th>")
                .append("<th>Suburb</th>")
                .append("<th>City</th>")
                .append("<th>Postal Code</th>")
                .append("</tr>");

        List<MccsUser> mccsUsers = service.loadUserDetailsById(entity.getId());
        for (MccsUser mccsUser : mccsUsers) {
            sb.append("<tr>");
            sb.append("<td>").append(mccsUser.getAddress().getStreetName()).append("</td>");
            sb.append("<td>").append(mccsUser.getAddress().getSuburb()).append("</td>");
            sb.append("<td>").append(mccsUser.getAddress().getCity()).append("</td>");
            sb.append("<td>").append(mccsUser.getAddress().getPostalCode()).append("</td>");
            sb.append("</tr>");

            sb.append("<tr>");
            sb.append("<td>").append("<img src=\"").append(mccsUser.getProfileImage().getPath())
                    .append("/").append(mccsUser.getProfileImage().getFileName()).append("\" alt=\"Profile Picture\"").append("</td>");
            sb.append("</tr>");
        }

        sb.append("</table>");

        content.setValue(sb.toString());

        return content;
    }

    protected Component createCloseButton(MccsUser entity) {
        Button closeButton = uiComponents.create(Button.class);
        closeButton.setIcon("font-icon:TIMES");
        BaseAction closeAction = new BaseAction("closeAction")
                .withHandler(actionPerformedEvent ->
                        mccsUsersTable.setDetailsVisible(entity, false))
                .withCaption("");
        closeButton.setAction(closeAction);
        return closeButton;
    }
}