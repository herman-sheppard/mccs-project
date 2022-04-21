package io.embraceit.mccsproject.listener;

import io.embraceit.mccsproject.entity.Mine;
import io.jmix.core.DataManager;
import io.jmix.core.event.EntityChangedEvent;
import io.jmix.core.event.EntityLoadingEvent;
import io.jmix.core.event.EntitySavingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component("mccs_MineEventListener")
public class MineEventListener {

    @Autowired
    private DataManager dataManager;

    @EventListener
    public void onMineLoading(EntityLoadingEvent<Mine> event) {
    }

    @EventListener
    public void onMineSaving(EntitySavingEvent<Mine> event) {
    }

    @EventListener
    public void onMineChangedBeforeCommit(EntityChangedEvent<Mine> event) {

    }

    @TransactionalEventListener
    public void onMineChangedAfterCommit(EntityChangedEvent<Mine> event) {

    }
}