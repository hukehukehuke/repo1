package com.schooLif.mapper;

import java.util.List;

import com.schoolLife.pojo.Pinlun;

public interface PinlunDao {
     //�����������
	
	public void addPL(Pinlun pinlun);
	
	//��ʾ������Ϣ
	public List<Pinlun> listPL();
}
