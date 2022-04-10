package io.embraceit.mccsproject.app;

import io.embraceit.mccsproject.entity.MccsUser;
import io.jmix.core.*;
import io.jmix.core.metamodel.model.MetaClass;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component("mccs_DataGridDetailsGeneratorService")
public class DataGridDetailsGeneratorService {

    @Autowired
    protected DataManager dataManager;
    @Autowired
    protected Metadata metadata;
    @Autowired
    protected FetchPlanRepository fetchPlanRepository;
    @Autowired
    protected ObjectProvider<FetchPlanBuilder> fetchPlanBuilder;

    public List<MccsUser> loadUserDetailsById(UUID mccsUserId) {
        MetaClass metaClass = metadata.getClass(MccsUser.class);
        LoadContext.Query query = new LoadContext.Query("select e from mccs_MccsUser e where e.id = :mccsUserId")
                .setParameter("mccsUserId", mccsUserId);
        FetchPlan fetchPlan = fetchPlanBuilder.getObject(MccsUser.class)
                .addFetchPlan(fetchPlanRepository.getFetchPlan(MccsUser.class, "_local"))
                .add("address", "_local")
                .add("profileImage", "_local")
                .build();
        LoadContext<MccsUser> lc = new LoadContext<>(metaClass);
        lc.setQuery(query);
        lc.setFetchPlan(fetchPlan);
        return dataManager.loadList(lc);
    }
}