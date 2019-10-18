package com.schoolLife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.StarDao;
import com.schoolLife.pojo.Star;
@Service
public class StarServiceImpl  implements StarService {
	
	@Autowired
	private StarDao starDao;
	
    public StarDao getStarDao() {
		return starDao;
	}

	public void setStarDao(StarDao starDao) {
		this.starDao = starDao;
	}

	//���
	@Override
	public void addStar(Star star) {		
		starDao.addStar(star);
	}
	//��ѯ
	@Override
	public List<Star> selectByStarTime(String starTitle) {
		// TODO Auto-generated method stub
		return starDao.selectByStarTime(starTitle);
	}
   //ɾ��
	@Override
	public void deleteStar(Integer starId) {
		starDao.deleteStar(starId);
		
	}

   
	

}
