package com.entity.vo;

import com.entity.GonggongsheshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 公共设施
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
public class GonggongsheshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设施图片
	 */
	
	private String sheshitupian;
		
	/**
	 * 设施位置
	 */
	
	private String sheshiweizhi;
		
	/**
	 * 设施视频
	 */
	
	private String sheshishipin;
		
	/**
	 * 设施详情
	 */
	
	private String sheshixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：设施图片
	 */
	 
	public void setSheshitupian(String sheshitupian) {
		this.sheshitupian = sheshitupian;
	}
	
	/**
	 * 获取：设施图片
	 */
	public String getSheshitupian() {
		return sheshitupian;
	}
				
	
	/**
	 * 设置：设施位置
	 */
	 
	public void setSheshiweizhi(String sheshiweizhi) {
		this.sheshiweizhi = sheshiweizhi;
	}
	
	/**
	 * 获取：设施位置
	 */
	public String getSheshiweizhi() {
		return sheshiweizhi;
	}
				
	
	/**
	 * 设置：设施视频
	 */
	 
	public void setSheshishipin(String sheshishipin) {
		this.sheshishipin = sheshishipin;
	}
	
	/**
	 * 获取：设施视频
	 */
	public String getSheshishipin() {
		return sheshishipin;
	}
				
	
	/**
	 * 设置：设施详情
	 */
	 
	public void setSheshixiangqing(String sheshixiangqing) {
		this.sheshixiangqing = sheshixiangqing;
	}
	
	/**
	 * 获取：设施详情
	 */
	public String getSheshixiangqing() {
		return sheshixiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
