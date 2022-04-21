package io.embraceit.mccsproject.screen.widget.minetablewidget;

import io.embraceit.mccsproject.entity.Mine;
import io.jmix.core.DataManager;
import io.jmix.dashboardsui.annotation.DashboardWidget;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.model.DataContext;
import io.jmix.ui.screen.ScreenFragment;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("mccs_MineTableWidget")
@UiDescriptor("mine-table-widget.xml")
@DashboardWidget(name = "Mine Data")
public class MineTableWidget extends ScreenFragment {
    @Autowired
    private CollectionContainer<Mine> minesDc;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private CollectionLoader<Mine> minesDl;
    @Autowired
    private DataContext dataContext;

    @Subscribe
    public void onInit(InitEvent event) {
        minesDc.setItems(dataManager.loadList(minesDl.createLoadContext()));
    }
}