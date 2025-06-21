package com.entity.view;

import com.entity.SheshiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 设施预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
@TableName("sheshiyuyue")
public class SheshiyuyueView  extends SheshiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheshiyuyueView(){
	}
 
 	public SheshiyuyueView(SheshiyuyueEntity sheshiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, sheshiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
