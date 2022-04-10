package io.embraceit.mccsproject.screen.employee;

import io.jmix.ui.screen.*;
import io.embraceit.mccsproject.entity.Employee;

@UiController("mccs_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
public class EmployeeEdit extends StandardEditor<Employee> {
}