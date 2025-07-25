package com.entity.view;

import com.entity.GonggongsheshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 公共设施
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
@TableName("gonggongsheshi")
public class GonggongsheshiView  extends GonggongsheshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonggongsheshiView(){
	}
 
 	public GonggongsheshiView(GonggongsheshiEntity gonggongsheshiEntity){
 	try {
			BeanUtils.copyProperties(this, gonggongsheshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
