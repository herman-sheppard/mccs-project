package io.embraceit.mccsproject.screen.procurementsupplier;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.ProcurementSupplier;

@UiController("mccs_ProcurementSupplier.browse")
@UiDescriptor("procurement-supplier-browse.xml")
@LookupComponent("procurementSuppliersTable")
public class ProcurementSupplierBrowse extends StandardLookup<ProcurementSupplier> {
}