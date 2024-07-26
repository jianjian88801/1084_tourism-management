package com.dao;

import com.entity.DiscussyoujifenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyoujifenxiangVO;
import com.entity.view.DiscussyoujifenxiangView;


/**
 * 游记分享评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
public interface DiscussyoujifenxiangDao extends BaseMapper<DiscussyoujifenxiangEntity> {
	
	List<DiscussyoujifenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);
	
	DiscussyoujifenxiangVO selectVO(@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);
	
	List<DiscussyoujifenxiangView> selectListView(@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);

	List<DiscussyoujifenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);
	
	DiscussyoujifenxiangView selectView(@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);
	

}
