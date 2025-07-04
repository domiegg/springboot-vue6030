package com.dao;

import com.entity.TousuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousuxinxiVO;
import com.entity.view.TousuxinxiView;


/**
 * 投诉信息
 * 
 * @author 
 * @email 
 * @date 2024-04-06 17:02:06
 */
public interface TousuxinxiDao extends BaseMapper<TousuxinxiEntity> {
	
	List<TousuxinxiVO> selectListVO(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	
	TousuxinxiVO selectVO(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	
	List<TousuxinxiView> selectListView(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);

	List<TousuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TousuxinxiEntity> wrapper);

	
	TousuxinxiView selectView(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TousuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TousuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TousuxinxiEntity> wrapper);



}
