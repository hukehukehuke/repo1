package com.schooLif.mapper;

import java.util.List;

import com.schoolLife.pojo.Star;

public interface StarDao {
	//���
   public void addStar(Star star);
   
   //��ѯ
   public List<Star> selectByStarTime(String starTitle);
   
   //ɾ��
   public void deleteStar(Integer starId);
}
