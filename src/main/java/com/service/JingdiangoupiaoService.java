package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdiangoupiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdiangoupiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdiangoupiaoView;


/**
 * 景点购票
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
public interface JingdiangoupiaoService extends IService<JingdiangoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdiangoupiaoVO> selectListVO(Wrapper<JingdiangoupiaoEntity> wrapper);
   	
   	JingdiangoupiaoVO selectVO(@Param("ew") Wrapper<JingdiangoupiaoEntity> wrapper);
   	
   	List<JingdiangoupiaoView> selectListView(Wrapper<JingdiangoupiaoEntity> wrapper);
   	
   	JingdiangoupiaoView selectView(@Param("ew") Wrapper<JingdiangoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdiangoupiaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JingdiangoupiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JingdiangoupiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JingdiangoupiaoEntity> wrapper);
}

