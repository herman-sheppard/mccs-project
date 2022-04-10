package io.embraceit.mccsproject.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.MappedSuperclass;

@JmixEntity(name = "mccs_ReportSection")
@MappedSuperclass
public class ReportSection extends ReportingEntity {
}