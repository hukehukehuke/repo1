package com.schoolLife.service;

import java.util.List;


import com.schoolLife.pojo.Star;

public interface StarService {
   //���
	public void addStar(Star star);
   //��ʱ��ѯ
	public List<Star> selectByStarTime(String starTitle);
	//ɾ��
	public void deleteStar(Integer starId);
}
