package com.entity.view;

import com.entity.BaoxiuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 报修处理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-06 17:02:06
 */
@TableName("baoxiuchuli")
public class BaoxiuchuliView  extends BaoxiuchuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiuchuliView(){
	}
 
 	public BaoxiuchuliView(BaoxiuchuliEntity baoxiuchuliEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiuchuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
