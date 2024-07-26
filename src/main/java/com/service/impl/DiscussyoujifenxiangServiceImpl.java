package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyoujifenxiangDao;
import com.entity.DiscussyoujifenxiangEntity;
import com.service.DiscussyoujifenxiangService;
import com.entity.vo.DiscussyoujifenxiangVO;
import com.entity.view.DiscussyoujifenxiangView;

@Service("discussyoujifenxiangService")
public class DiscussyoujifenxiangServiceImpl extends ServiceImpl<DiscussyoujifenxiangDao, DiscussyoujifenxiangEntity> implements DiscussyoujifenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyoujifenxiangEntity> page = this.selectPage(
                new Query<DiscussyoujifenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussyoujifenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyoujifenxiangEntity> wrapper) {
		  Page<DiscussyoujifenxiangView> page =new Query<DiscussyoujifenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyoujifenxiangVO> selectListVO(Wrapper<DiscussyoujifenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyoujifenxiangVO selectVO(Wrapper<DiscussyoujifenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyoujifenxiangView> selectListView(Wrapper<DiscussyoujifenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyoujifenxiangView selectView(Wrapper<DiscussyoujifenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
