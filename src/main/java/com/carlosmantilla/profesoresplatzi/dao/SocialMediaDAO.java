package com.carlosmantilla.profesoresplatzi.dao;

import java.util.List;

import com.carlosmantilla.profesoresplatzi.model.SocialMedia;
import com.carlosmantilla.profesoresplatzi.model.TeacherSocialMedia;

public interface SocialMediaDAO {
	
	void saveSocialMedia(SocialMedia socialMedia);

	List<SocialMedia> findAllSocialMedias();

	void updateSocialMedia(SocialMedia socialmedia);

	void deteleSocialMediaById(Long idSocialMedia);
	
	SocialMedia findById(Long idSocialMedia);
	
	SocialMedia findByName (String name);
	
	TeacherSocialMedia findSocialMediaByIdAndName (Long idSocialMedia, String nickname);

}
