package com.entity.view;

import com.entity.DiscussyoujifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游记分享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
@TableName("discussyoujifenxiang")
public class DiscussyoujifenxiangView  extends DiscussyoujifenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyoujifenxiangView(){
	}
 
 	public DiscussyoujifenxiangView(DiscussyoujifenxiangEntity discussyoujifenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussyoujifenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
