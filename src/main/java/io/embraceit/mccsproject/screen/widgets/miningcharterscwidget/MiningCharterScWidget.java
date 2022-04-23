package io.embraceit.mccsproject.screen.widgets.miningcharterscwidget;

import io.embraceit.mccsproject.entity.MiningCharterScorecard;
import io.jmix.core.DataManager;
import io.jmix.dashboardsui.annotation.DashboardWidget;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.ScreenFragment;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("mccs_MiningCharterScWidget")
@UiDescriptor("mining-charter-sc-widget.xml")
@DashboardWidget(name = "Mine Charter Scorecard")
public class MiningCharterScWidget extends ScreenFragment {
    @Autowired
    private DataManager dataManager;
    @Autowired
    private CollectionContainer<MiningCharterScorecard> miningCharterScorecardsDc;
    @Autowired
    private CollectionLoader<MiningCharterScorecard> miningCharterScorecardsDl;

    @Subscribe
    public void onInit(InitEvent event) {
        miningCharterScorecardsDc.setItems(dataManager.loadList(miningCharterScorecardsDl.createLoadContext()));
    }
}