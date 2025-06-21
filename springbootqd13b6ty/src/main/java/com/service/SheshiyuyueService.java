package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheshiyuyueView;


/**
 * 设施预约
 *
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
public interface SheshiyuyueService extends IService<SheshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheshiyuyueVO> selectListVO(Wrapper<SheshiyuyueEntity> wrapper);
   	
   	SheshiyuyueVO selectVO(@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);
   	
   	List<SheshiyuyueView> selectListView(Wrapper<SheshiyuyueEntity> wrapper);
   	
   	SheshiyuyueView selectView(@Param("ew") Wrapper<SheshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheshiyuyueEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<SheshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<SheshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<SheshiyuyueEntity> wrapper);



}

