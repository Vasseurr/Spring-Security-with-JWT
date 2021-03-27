package com.vasseurr.SecurityJWT.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users", uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") 
	})
@NoArgsConstructor
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max = 30)
	private String username;
	
	@NotBlank
	@Size(max = 50)
	private String email;
	
	@NotBlank
	@Size(max = 100)
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), 
			   inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User(String username,  String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	
}
