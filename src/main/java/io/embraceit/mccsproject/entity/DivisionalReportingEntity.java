package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@JmixEntity
@Table(name = "MCCS_DIVISIONAL_REPORTING_ENTITY")
@Entity(name = "mccs_DivisionalReportingEntity")
public class DivisionalReportingEntity extends ReportingEntity {
}