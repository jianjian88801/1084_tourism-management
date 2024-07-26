package com.dao;

import com.entity.YoujifenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YoujifenxiangVO;
import com.entity.view.YoujifenxiangView;


/**
 * 游记分享
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
public interface YoujifenxiangDao extends BaseMapper<YoujifenxiangEntity> {
	
	List<YoujifenxiangVO> selectListVO(@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);
	
	YoujifenxiangVO selectVO(@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);
	
	List<YoujifenxiangView> selectListView(@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);

	List<YoujifenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);
	
	YoujifenxiangView selectView(@Param("ew") Wrapper<YoujifenxiangEntity> wrapper);
	

}
