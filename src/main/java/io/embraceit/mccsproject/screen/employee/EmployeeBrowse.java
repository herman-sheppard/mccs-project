package io.embraceit.mccsproject.screen.employee;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Employee;

@UiController("mccs_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
public class EmployeeBrowse extends StandardLookup<Employee> {
}