package io.embraceit.mccsproject.screen.miningcharterscorecard;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MiningCharterScorecard;

@UiController("mccs_MiningCharterScorecard.edit")
@UiDescriptor("mining-charter-scorecard-edit.xml")
@EditedEntityContainer("miningCharterScorecardDc")
public class MiningCharterScorecardEdit extends StandardEditor<MiningCharterScorecard> {
}