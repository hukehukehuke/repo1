package com.schooLif.mapper;

import com.schoolLife.pojo.Dianzan;

public interface DianzanDao {
    //��ӱ������
	public void addDainzan(Dianzan dianzan);
	//ɾ��ȡ������
	public int deletePriKeyDz(String id);
	//�����û��Ƿ����
	public Dianzan chakanDz(Dianzan dianzan);

}
