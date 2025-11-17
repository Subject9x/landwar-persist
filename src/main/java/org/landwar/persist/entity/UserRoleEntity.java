package org.landwar.persist.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_ROLE_REF")
public class UserRoleEntity extends BaseEntity{
	
	@Id
	@Column
	private Long id;
	
	@Column
	private String role;
	
	@Column(name="create_tm")
	private LocalDateTime createTm;
	
	
	@Column(name="update_tm")
	private LocalDateTime updateTm;


	public UserRoleEntity() {}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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


	@Override
	public String toString() {
		return "UserRoleEntity [id=" + id + ", role=" + role + ", createTm=" + createTm + ", updateTm=" + updateTm
				+ "]";
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
		UserRoleEntity other = (UserRoleEntity) obj;
		return Objects.equals(id, other.id);
	}
	
}
