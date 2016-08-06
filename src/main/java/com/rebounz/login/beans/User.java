package com.rebounz.login.beans;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	@NotNull(message="{username.field.mandatory}")
	@Pattern(regexp="^[a-zA-Z0-9_-]{3,15}$", message="{username.field.invalid}")
	private String username;
	
	@NotNull(message="{password.field.mandatory}")
	private String password;
	
	private String salt;
	
	private String passwordHash;
	
	@NotNull(message="firstname.field.mandatory")
	private String firstname;

	@NotNull(message="lastname.field.mandatory")
	private String lastname;
	
	private String status;
	
	@NotNull(message="{email.field.mandatory}")
	@Pattern(regexp="([\\w-.]+)@((?:[\\w]+.)+)([a-zA-Z]{2,4})", message="{email.field.invalid}")
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((passwordHash == null) ? 0 : passwordHash.hashCode());
		result = prime * result + ((salt == null) ? 0 : salt.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) 
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (passwordHash == null) {
			if (other.passwordHash != null)
				return false;
		} else if (!passwordHash.equals(other.passwordHash))
			return false;
		if (salt == null) {
			if (other.salt != null)
				return false;
		} else if (!salt.equals(other.salt))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", salt=" + salt
				+ ", passwordHash=" + passwordHash + ", firstname=" + firstname + ", lastname=" + lastname + ", status="
				+ status + ",email=" + email +"]";
	}
	
	public static void main(String[] args) {
		String regex = "([\\w-.]+)@((?:[\\w]+.)+)([a-zA-Z]{2,4})";
		System.out.println(java.util.regex.Pattern.matches(regex, "123@gmail.com.com.com.com.1"));

	}
	
}
