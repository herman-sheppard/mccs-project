package io.embraceit.mccsproject.screen.procurementsupplier;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.ProcurementSupplier;

@UiController("mccs_ProcurementSupplier.edit")
@UiDescriptor("procurement-supplier-edit.xml")
@EditedEntityContainer("procurementSupplierDc")
public class ProcurementSupplierEdit extends StandardEditor<ProcurementSupplier> {
}