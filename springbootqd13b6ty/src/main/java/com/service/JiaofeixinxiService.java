package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaofeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaofeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaofeixinxiView;


/**
 * 缴费信息
 *
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
public interface JiaofeixinxiService extends IService<JiaofeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaofeixinxiVO> selectListVO(Wrapper<JiaofeixinxiEntity> wrapper);
   	
   	JiaofeixinxiVO selectVO(@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);
   	
   	List<JiaofeixinxiView> selectListView(Wrapper<JiaofeixinxiEntity> wrapper);
   	
   	JiaofeixinxiView selectView(@Param("ew") Wrapper<JiaofeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaofeixinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiaofeixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiaofeixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiaofeixinxiEntity> wrapper);



}

