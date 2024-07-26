package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YoujifenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YoujifenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YoujifenxiangView;


/**
 * 游记分享
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
public interface YoujifenxiangService extends IService<YoujifenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoujifenxiangVO> selectListVO(Wrapper<YoujifenxiangEntity> wrapper);
   	
   	YoujifenxiangVO selectVO(@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);
   	
   	List<YoujifenxiangView> selectListView(Wrapper<YoujifenxiangEntity> wrapper);
   	
   	YoujifenxiangView selectView(@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoujifenxiangEntity> wrapper);
   	

}

