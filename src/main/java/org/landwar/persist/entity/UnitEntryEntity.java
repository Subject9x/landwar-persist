package org.landwar.persist.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Subject9x
 */
@Entity
@Table(name = "UNIT_INFO")
public class UnitEntryEntity extends BaseEntity{
	
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "unitname")
	private String unitname;

	@Column(name = "total_points")
	private Double totalPoints;

	@Column(name = "size")
	private Integer size;

	@Column(name = "move")
	private Integer move;

	@Column(name = "evade")
	private Integer evade;

	@Column(name = "armor")
	private Integer armor;

	@Column(name = "dmg_mel")
	private Integer damageMelee;

	@Column(name = "dmg_rng")
	private Integer damageRanged;

	@Column(name = "desc")
	private Integer effectiveRange;

	@Column(name = "desc")
	private String desc;

	@Column(name = "app_user")
	private Long appUserId;
	
	@Column(name = "update_tm")
	private LocalDateTime updateTm;

	@Column(name = "create_tm")
	private LocalDateTime createTm;
	
	@ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private UserEntity appUser;
	
	
	public UnitEntryEntity() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public Double getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Double totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getMove() {
		return move;
	}

	public void setMove(Integer move) {
		this.move = move;
	}

	public Integer getEvade() {
		return evade;
	}

	public void setEvade(Integer evade) {
		this.evade = evade;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getDamageMelee() {
		return damageMelee;
	}

	public void setDamageMelee(Integer damageMelee) {
		this.damageMelee = damageMelee;
	}

	public Integer getDamageRanged() {
		return damageRanged;
	}

	public void setDamageRanged(Integer damageRanged) {
		this.damageRanged = damageRanged;
	}

	public Integer getEffectiveRange() {
		return effectiveRange;
	}

	public void setEffectiveRange(Integer effectiveRange) {
		this.effectiveRange = effectiveRange;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getAppUser() {
		return appUserId;
	}

	public void setAppUser(Long appUserId) {
		this.appUserId = appUserId;
	}

	public LocalDateTime getUpdateTm() {
		return updateTm;
	}

	public void setUpdateTm(LocalDateTime updateTm) {
		this.updateTm = updateTm;
	}

	public LocalDateTime getCreateTm() {
		return createTm;
	}

	public void setCreateTm(LocalDateTime createTm) {
		this.createTm = createTm;
	}

	@Override
	public String toString() {
		return "UnitEntryEntity [id=" + id + ", unitname=" + unitname + ", totalPoints=" + totalPoints + ", size="
				+ size + ", move=" + move + ", evade=" + evade + ", armor=" + armor + ", damageMelee=" + damageMelee
				+ ", damageRanged=" + damageRanged + ", effectiveRange=" + effectiveRange + ", desc=" + desc
				+ ", appUser=" + appUser + ", updateTm=" + updateTm + ", createTm=" + createTm + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnitEntryEntity other = (UnitEntryEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
