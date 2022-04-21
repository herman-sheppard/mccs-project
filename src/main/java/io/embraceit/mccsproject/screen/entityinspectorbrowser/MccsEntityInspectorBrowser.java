package io.embraceit.mccsproject.screen.entityinspectorbrowser;

import io.jmix.datatoolsui.screen.entityinspector.EntityInspectorBrowser;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("entityInspector.browse")
@UiDescriptor("mccs-entity-inspector-browser.xml")
public class MccsEntityInspectorBrowser extends EntityInspectorBrowser {

    @Subscribe
    public void onBeforeShow1(BeforeShowEvent event) {
        if (entitiesTable != null) {
            entitiesTable.getPagination().setItemsPerPageDefaultValue(5000);
        }
    }

}