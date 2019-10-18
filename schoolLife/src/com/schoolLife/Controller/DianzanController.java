package com.schoolLife.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolLife.pojo.Dianzan;

import com.schoolLife.service.DianzanService;



@Controller
public class DianzanController {
    @Autowired
    private DianzanService dianzanService;
   
    //���
    @RequestMapping(method = RequestMethod.POST, value = "/addDianzan")
    @ResponseBody
    public String addDianzan(Dianzan dianzan,HttpServletRequest request,String userId,String userYeMianId)throws Exception{
    	 //��ȡϵͳʱ�䲢����
  	  SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ	 
  	  Date date = new Date();
  	  String str =df.format(date);
        //��ѯ�Ƿ��и��û��ĵ��޼�¼
    	Dianzan dianzan2=dianzanService.chakanDz(dianzan);
        int result=0;
        if (dianzan2!=null){
            System.out.println("�иü�¼");         
            dianzanService.deletePriKeyDz(dianzan2.getUserId());
            result--;
            
        }else{
        	
        	result++;
        	dianzan.setStarTime(str);
        	dianzan.setUserDianzan(result);
        	
        	dianzan.setUserId(request.getParameter("userId"));
        	dianzan.setUserYeMianId(request.getParameter("userYeMianId"));        	
            dianzanService.addDainzan(dianzan);
          
        }
        return ""+result;
    }
    
  
}
