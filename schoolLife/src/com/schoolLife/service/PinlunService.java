package com.schoolLife.service;

import java.util.List;

import com.schoolLife.pojo.Pinlun;

public interface PinlunService {
	 //�����������
	
		public void addPL(Pinlun pinlun);
		
		//��ʾ������Ϣ
		public List<Pinlun> listPL();
}
