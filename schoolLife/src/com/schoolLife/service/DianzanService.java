package com.schoolLife.service;

import com.schoolLife.pojo.Dianzan;

public interface DianzanService {
	 //��ӱ������
	public void addDainzan(Dianzan dianzan);
    //ɾ��ȡ������
	public int deletePriKeyDz(String id);
	//�����û��Ƿ����
	public Dianzan chakanDz(Dianzan dianzan);
}
