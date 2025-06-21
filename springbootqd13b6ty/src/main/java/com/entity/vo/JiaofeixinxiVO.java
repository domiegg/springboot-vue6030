package com.entity.vo;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缴费信息
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
public class JiaofeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 楼栋
	 */
	
	private String loudong;
		
	/**
	 * 门牌号
	 */
	
	private String menpaihao;
		
	/**
	 * 水费
	 */
	
	private Double shuifei;
		
	/**
	 * 电费
	 */
	
	private Double dianfei;
		
	/**
	 * 管理费
	 */
	
	private Double guanlifei;
		
	/**
	 * 清洁费
	 */
	
	private Double qingjiefei;
		
	/**
	 * 缴费金额
	 */
	
	private Double jiaofeijine;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 清单
	 */
	
	private String qingdan;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：楼栋
	 */
	 
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	
	/**
	 * 获取：楼栋
	 */
	public String getLoudong() {
		return loudong;
	}
				
	
	/**
	 * 设置：门牌号
	 */
	 
	public void setMenpaihao(String menpaihao) {
		this.menpaihao = menpaihao;
	}
	
	/**
	 * 获取：门牌号
	 */
	public String getMenpaihao() {
		return menpaihao;
	}
				
	
	/**
	 * 设置：水费
	 */
	 
	public void setShuifei(Double shuifei) {
		this.shuifei = shuifei;
	}
	
	/**
	 * 获取：水费
	 */
	public Double getShuifei() {
		return shuifei;
	}
				
	
	/**
	 * 设置：电费
	 */
	 
	public void setDianfei(Double dianfei) {
		this.dianfei = dianfei;
	}
	
	/**
	 * 获取：电费
	 */
	public Double getDianfei() {
		return dianfei;
	}
				
	
	/**
	 * 设置：管理费
	 */
	 
	public void setGuanlifei(Double guanlifei) {
		this.guanlifei = guanlifei;
	}
	
	/**
	 * 获取：管理费
	 */
	public Double getGuanlifei() {
		return guanlifei;
	}
				
	
	/**
	 * 设置：清洁费
	 */
	 
	public void setQingjiefei(Double qingjiefei) {
		this.qingjiefei = qingjiefei;
	}
	
	/**
	 * 获取：清洁费
	 */
	public Double getQingjiefei() {
		return qingjiefei;
	}
				
	
	/**
	 * 设置：缴费金额
	 */
	 
	public void setJiaofeijine(Double jiaofeijine) {
		this.jiaofeijine = jiaofeijine;
	}
	
	/**
	 * 获取：缴费金额
	 */
	public Double getJiaofeijine() {
		return jiaofeijine;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：清单
	 */
	 
	public void setQingdan(String qingdan) {
		this.qingdan = qingdan;
	}
	
	/**
	 * 获取：清单
	 */
	public String getQingdan() {
		return qingdan;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
