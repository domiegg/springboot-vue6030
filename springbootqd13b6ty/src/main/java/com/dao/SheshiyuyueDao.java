package com.dao;

import com.entity.SheshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheshiyuyueVO;
import com.entity.view.SheshiyuyueView;


/**
 * 设施预约
 * 
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
public interface SheshiyuyueDao extends BaseMapper<SheshiyuyueEntity> {
	
	List<SheshiyuyueVO> selectListVO(@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);
	
	SheshiyuyueVO selectVO(@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);
	
	List<SheshiyuyueView> selectListView(@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);

	List<SheshiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);

	
	SheshiyuyueView selectView(@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);



}
