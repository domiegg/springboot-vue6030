package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TousuchuliEntity;
import com.entity.view.TousuchuliView;

import com.service.TousuchuliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 投诉处理
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 17:02:06
 */
@RestController
@RequestMapping("/tousuchuli")
public class TousuchuliController {
    @Autowired
    private TousuchuliService tousuchuliService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TousuchuliEntity tousuchuli,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tousuchuli.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TousuchuliEntity> ew = new EntityWrapper<TousuchuliEntity>();

		PageUtils page = tousuchuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tousuchuli), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TousuchuliEntity tousuchuli, 
		HttpServletRequest request){
        EntityWrapper<TousuchuliEntity> ew = new EntityWrapper<TousuchuliEntity>();

		PageUtils page = tousuchuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tousuchuli), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TousuchuliEntity tousuchuli){
       	EntityWrapper<TousuchuliEntity> ew = new EntityWrapper<TousuchuliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tousuchuli, "tousuchuli")); 
        return R.ok().put("data", tousuchuliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TousuchuliEntity tousuchuli){
        EntityWrapper< TousuchuliEntity> ew = new EntityWrapper< TousuchuliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tousuchuli, "tousuchuli")); 
		TousuchuliView tousuchuliView =  tousuchuliService.selectView(ew);
		return R.ok("查询投诉处理成功").put("data", tousuchuliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TousuchuliEntity tousuchuli = tousuchuliService.selectById(id);
        return R.ok().put("data", tousuchuli);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TousuchuliEntity tousuchuli = tousuchuliService.selectById(id);
        return R.ok().put("data", tousuchuli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TousuchuliEntity tousuchuli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tousuchuli);
        tousuchuliService.insert(tousuchuli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TousuchuliEntity tousuchuli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tousuchuli);
        tousuchuliService.insert(tousuchuli);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TousuchuliEntity tousuchuli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tousuchuli);
        tousuchuliService.updateById(tousuchuli);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tousuchuliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
