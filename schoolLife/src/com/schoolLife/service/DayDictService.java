package com.schoolLife.service;


import java.util.List;

import com.schoolLife.pojo.Day;

public interface DayDictService {
	//�����ѯ
	public List<Day> selectDangTianDayList();
	//ֱ�Ӳ�ѯ
	public List<Day>  selectDayList();
	//��ѯ
	public List<Day>  selectDayListByDateTime(String teampTime);
	//���
	public void addDay(Day day);
	//ɾ��
	public void deleteDay(Integer id);
	
}
