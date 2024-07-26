package com.entity.view;

import com.entity.YoujifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游记分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
@TableName("youjifenxiang")
public class YoujifenxiangView  extends YoujifenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YoujifenxiangView(){
	}
 
 	public YoujifenxiangView(YoujifenxiangEntity youjifenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, youjifenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
