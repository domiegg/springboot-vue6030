package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousuxinxiView;


/**
 * 投诉信息
 *
 * @author 
 * @email 
 * @date 2024-04-06 17:02:06
 */
public interface TousuxinxiService extends IService<TousuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousuxinxiVO> selectListVO(Wrapper<TousuxinxiEntity> wrapper);
   	
   	TousuxinxiVO selectVO(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
   	
   	List<TousuxinxiView> selectListView(Wrapper<TousuxinxiEntity> wrapper);
   	
   	TousuxinxiView selectView(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousuxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TousuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TousuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TousuxinxiEntity> wrapper);



}

