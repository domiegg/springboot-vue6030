package com.dao;

import com.entity.JiaofeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaofeixinxiVO;
import com.entity.view.JiaofeixinxiView;


/**
 * 缴费信息
 * 
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
public interface JiaofeixinxiDao extends BaseMapper<JiaofeixinxiEntity> {
	
	List<JiaofeixinxiVO> selectListVO(@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);
	
	JiaofeixinxiVO selectVO(@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);
	
	List<JiaofeixinxiView> selectListView(@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);

	List<JiaofeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);

	
	JiaofeixinxiView selectView(@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);



}
