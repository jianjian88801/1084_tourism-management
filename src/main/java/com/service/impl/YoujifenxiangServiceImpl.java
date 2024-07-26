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


import com.dao.YoujifenxiangDao;
import com.entity.YoujifenxiangEntity;
import com.service.YoujifenxiangService;
import com.entity.vo.YoujifenxiangVO;
import com.entity.view.YoujifenxiangView;

@Service("youjifenxiangService")
public class YoujifenxiangServiceImpl extends ServiceImpl<YoujifenxiangDao, YoujifenxiangEntity> implements YoujifenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoujifenxiangEntity> page = this.selectPage(
                new Query<YoujifenxiangEntity>(params).getPage(),
                new EntityWrapper<YoujifenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoujifenxiangEntity> wrapper) {
		  Page<YoujifenxiangView> page =new Query<YoujifenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YoujifenxiangVO> selectListVO(Wrapper<YoujifenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YoujifenxiangVO selectVO(Wrapper<YoujifenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YoujifenxiangView> selectListView(Wrapper<YoujifenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoujifenxiangView selectView(Wrapper<YoujifenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
