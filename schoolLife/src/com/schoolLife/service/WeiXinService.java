package com.schoolLife.service;

import com.schoolLife.pojo.WeiXin;

public interface WeiXinService {
	//��ӱ���
	   public void addWeiXin(WeiXin weiXin);
	   //��ѯ
	   public WeiXin chakanWeixin(String openid);
	   //�޸�
	   public WeiXin xiugaiWEixin(WeiXin weiXin);
}
