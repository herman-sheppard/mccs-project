package io.embraceit.mccsproject.entity;

import io.embraceit.mccsproject.entity.enums.Sectors;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "MCCS_MINE", indexes = {
		@Index(name = "IDX_MINE", columnList = "COMMODITY")
})
@Entity(name = "mccs_Mine")
public class Mine extends StandardEntity {

	@Column(name = "MINE_CODE")
	private String mineCode;

	@Lob
	@InstanceName
	@Column(name = "MINE_NAME")
	private String mineName;

	@Lob
	@Column(name = "OWNER")
	private String owner;

	@Lob
	@Column(name = "COMMODITY")
	private String commodity;

	@Column(name = "PROVINCE")
	private String province;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "FARM", length = 1000)
	private String farm;

	@Column(name = "TEL")
	private String tel;

	@Lob
	@Column(name = "POSTAL")
	private String postal;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "SECTOR")
	private String sector;

	public Sectors getSector() {

		return sector == null ? null : Sectors.valueOf(sector);
	}

	public void setSector(Sectors sector) {
		this.sector = sector == null ? null : sector.name();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getMineName() {
		return mineName;
	}

	public void setMineName(String mineName) {
		this.mineName = mineName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getMineCode() {
		return mineCode;
	}

	public void setMineCode(String mineCode) {
		this.mineCode = mineCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getCommodity() {
		return commodity;
	}


}