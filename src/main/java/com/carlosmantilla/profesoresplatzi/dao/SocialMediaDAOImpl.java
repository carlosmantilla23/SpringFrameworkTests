package com.carlosmantilla.profesoresplatzi.dao;

import java.util.List;

import com.carlosmantilla.profesoresplatzi.model.SocialMedia;
import com.carlosmantilla.profesoresplatzi.model.TeacherSocialMedia;

public class SocialMediaDAOImpl extends AbstractSession implements SocialMediaDAO {

	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		getSession().persist(socialMedia);
		
	}
	@Override
	public List<SocialMedia> findAllSocialMedias() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from SocialMedia").list();
	}
	
	@Override
	public void updateSocialMedia(SocialMedia socialmedia) {
		// TODO Auto-generated method stub
		getSession().update(socialmedia);

	}

	@Override
	public void deteleSocialMediaById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		SocialMedia socialMedia = findById(idSocialMedia);
		if (socialMedia != null) {
			getSession().delete(socialMedia);
		}
	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		return (SocialMedia) getSession().get(SocialMedia.class, idSocialMedia);
	}
	@Override
	public SocialMedia findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname) {
		// TODO Auto-generated method stub
		return null;
	}

}
