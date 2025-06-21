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


import com.dao.SheshiyuyueDao;
import com.entity.SheshiyuyueEntity;
import com.service.SheshiyuyueService;
import com.entity.vo.SheshiyuyueVO;
import com.entity.view.SheshiyuyueView;

@Service("sheshiyuyueService")
public class SheshiyuyueServiceImpl extends ServiceImpl<SheshiyuyueDao, SheshiyuyueEntity> implements SheshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheshiyuyueEntity> page = this.selectPage(
                new Query<SheshiyuyueEntity>(params).getPage(),
                new EntityWrapper<SheshiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheshiyuyueEntity> wrapper) {
		  Page<SheshiyuyueView> page =new Query<SheshiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<SheshiyuyueVO> selectListVO(Wrapper<SheshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheshiyuyueVO selectVO(Wrapper<SheshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheshiyuyueView> selectListView(Wrapper<SheshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheshiyuyueView selectView(Wrapper<SheshiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<SheshiyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<SheshiyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<SheshiyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
