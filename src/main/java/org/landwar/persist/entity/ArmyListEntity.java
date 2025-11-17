package org.landwar.persist.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARMY_LIST")
public class ArmyListEntity extends BaseEntity {	
	
	@Id
	@Column
	private Long id;
	
	@Column
	private String name;
	
	
	@Column
	private String desc;
	
	@Column
	private Integer points;
	
	@Column(name = "app_user")
	@ManyToOne()
	private UserEntity appUser;
	
	
	@Column(name = "update_tm")
	private LocalDateTime updateTm;
	
	@Column(name = "create_tm")
	private LocalDateTime createTm;
	
	public ArmyListEntity() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public UserEntity getAppUser() {
		return appUser;
	}

	public void setAppUser(UserEntity appUser) {
		this.appUser = appUser;
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
		return "ArmyListEntity [id=" + id + ", name=" + name + ", desc=" + desc + ", points=" + points + ", appUser="
				+ appUser + ", updateTm=" + updateTm + ", createTm=" + createTm + "]";
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
		ArmyListEntity other = (ArmyListEntity) obj;
		return Objects.equals(id, other.id);
	}
	
}
