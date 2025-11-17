package org.landwar.persist.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RULES_SET_REF")
public class RulesRefEntity extends BaseEntity {

	@Id
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String desc;
	
	@Column(name="create_tm")
	private LocalDateTime createTm;
	
	@Column(name="update_tm")
	private LocalDateTime updateTm;


	public RulesRefEntity() {}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String role) {
		this.name = role;
	}

	public LocalDateTime getCreateTm() {
		return createTm;
	}

	public void setCreateTm(LocalDateTime createTm) {
		this.createTm = createTm;
	}

	public LocalDateTime getUpdateTm() {
		return updateTm;
	}

	public void setUpdateTm(LocalDateTime updateTm) {
		this.updateTm = updateTm;
	}
	
	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "RulesRefEntity [id=" + id + ", name=" + name + ", desc=" + desc + ", createTm=" + createTm
				+ ", updateTm=" + updateTm + "]";
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
		RulesRefEntity other = (RulesRefEntity) obj;
		return Objects.equals(id, other.id);
	}
}
