package com.haftamu.language.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "language")
public class Language{
	
	@Column(nullable=false)
	@Size(min = 2, max = 20)
	private String creator;
	@Column(nullable=false)
	@Size(min = 2, max = 20)
	private String name;
//	@Column(nullable = false)
//	@Size(min = 1, max = 200)
	@NotNull
    private float version;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	public Language() {
	
	}
	
	public Language(String name, String creator, float version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
		
	}
	
	
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}