package com.carlosmantilla.profesoresplatzi.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "social_media")
public class SocialMedia implements Serializable {

	@Id
	@Column(name = "id_social_media")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Que el campo va a ser único
	private Long idSocialMedia;

	@Column(name = "name")
	private String name;

	@Column(name = "icon")
	private String icon;

	@OneToMany
	@JoinColumn(name = "id_social_media")
	private Set<TeacherSocialMedia> TeacherSocialMedias;

	public Set<TeacherSocialMedia> getTeacherSocialMedias() {
		return TeacherSocialMedias;
	}

	public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
		TeacherSocialMedias = teacherSocialMedias;
	}

	public Long getIdSocialMedia() {
		return idSocialMedia;
	}

	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public SocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocialMedia(String name, String icon) {
		super();
		this.name = name;
		this.icon = icon;
	}

}
