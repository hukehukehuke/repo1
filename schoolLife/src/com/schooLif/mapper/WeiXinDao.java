package com.schooLif.mapper;

import com.schoolLife.pojo.WeiXin;

public interface WeiXinDao {
	//��ӱ���
   public void addWeiXin(WeiXin weiXin);
   //��ѯ
   public WeiXin chakanWeixin(String openid);
   //�޸�
   public WeiXin xiugaiWEixin(WeiXin weiXin);
}
