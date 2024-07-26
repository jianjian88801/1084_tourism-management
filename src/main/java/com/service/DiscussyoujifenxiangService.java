package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyoujifenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyoujifenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyoujifenxiangView;


/**
 * 游记分享评论表
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:44:42
 */
public interface DiscussyoujifenxiangService extends IService<DiscussyoujifenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyoujifenxiangVO> selectListVO(Wrapper<DiscussyoujifenxiangEntity> wrapper);
   	
   	DiscussyoujifenxiangVO selectVO(@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);
   	
   	List<DiscussyoujifenxiangView> selectListView(Wrapper<DiscussyoujifenxiangEntity> wrapper);
   	
   	DiscussyoujifenxiangView selectView(@Param("ew") Wrapper<DiscussyoujifenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyoujifenxiangEntity> wrapper);
   	

}

