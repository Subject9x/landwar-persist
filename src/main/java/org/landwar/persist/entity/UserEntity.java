package org.landwar.persist.entity;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * Base user entity
 * @author Subject9x
 */
@Entity(name = "APP_USER")
@Table(name = "APP_USER")
@NamedQuery(name = "UserEntity.getAllUsers", query = "SELECT u FROM UserEntity u ORDER BY u.id DESC")
public class UserEntity extends BaseEntity{

	
	@Id
	@Column(name = "id", nullable = true)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "passcode", nullable = false)
	private String passcode;
	
	@Column(name = "logged_in", nullable = false)
	private boolean loggedIn;
	
	@Column(name = "login_time", nullable = true)
	private LocalDateTime loginTime;
	
	@Column(name = "create_tm", nullable = false)
	private LocalDateTime createTm;
	
	@Column(name = "update_tm", nullable = false)
	private LocalDateTime updateTm;
	
	@Column(name = "jwt_token")
	private byte[] jwtToken;

	
	public UserEntity() {}
	
	
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

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public LocalDateTime getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
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

	public byte[] getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(byte[] jwtToken) {
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passcode=" + passcode + ", loggedIn=" + loggedIn
				+ ", loginTime=" + loginTime + ", createTm=" + createTm + ", updateTm=" + updateTm + ", jwtToken="
				+ Arrays.toString(jwtToken) + "]";
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
		UserEntity other = (UserEntity) obj;
		return Objects.equals(id, other.id);
	}

}
