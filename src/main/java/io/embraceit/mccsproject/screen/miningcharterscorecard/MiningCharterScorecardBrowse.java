package io.embraceit.mccsproject.screen.miningcharterscorecard;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.MiningCharterScorecard;

@UiController("mccs_MiningCharterScorecard.browse")
@UiDescriptor("mining-charter-scorecard-browse.xml")
@LookupComponent("miningCharterScorecardsTable")
public class MiningCharterScorecardBrowse extends StandardLookup<MiningCharterScorecard> {
}