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

import com.entity.GonggongsheshiEntity;
import com.entity.view.GonggongsheshiView;

import com.service.GonggongsheshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 公共设施
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 17:02:07
 */
@RestController
@RequestMapping("/gonggongsheshi")
public class GonggongsheshiController {
    @Autowired
    private GonggongsheshiService gonggongsheshiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GonggongsheshiEntity gonggongsheshi,
		HttpServletRequest request){
        EntityWrapper<GonggongsheshiEntity> ew = new EntityWrapper<GonggongsheshiEntity>();

		PageUtils page = gonggongsheshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggongsheshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GonggongsheshiEntity gonggongsheshi, 
		HttpServletRequest request){
        EntityWrapper<GonggongsheshiEntity> ew = new EntityWrapper<GonggongsheshiEntity>();

		PageUtils page = gonggongsheshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggongsheshi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GonggongsheshiEntity gonggongsheshi){
       	EntityWrapper<GonggongsheshiEntity> ew = new EntityWrapper<GonggongsheshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gonggongsheshi, "gonggongsheshi")); 
        return R.ok().put("data", gonggongsheshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GonggongsheshiEntity gonggongsheshi){
        EntityWrapper< GonggongsheshiEntity> ew = new EntityWrapper< GonggongsheshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gonggongsheshi, "gonggongsheshi")); 
		GonggongsheshiView gonggongsheshiView =  gonggongsheshiService.selectView(ew);
		return R.ok("查询公共设施成功").put("data", gonggongsheshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GonggongsheshiEntity gonggongsheshi = gonggongsheshiService.selectById(id);
        return R.ok().put("data", gonggongsheshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GonggongsheshiEntity gonggongsheshi = gonggongsheshiService.selectById(id);
        return R.ok().put("data", gonggongsheshi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        GonggongsheshiEntity gonggongsheshi = gonggongsheshiService.selectById(id);
        if(type.equals("1")) {
        	gonggongsheshi.setThumbsupnum(gonggongsheshi.getThumbsupnum()+1);
        } else {
        	gonggongsheshi.setCrazilynum(gonggongsheshi.getCrazilynum()+1);
        }
        gonggongsheshiService.updateById(gonggongsheshi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GonggongsheshiEntity gonggongsheshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gonggongsheshi);
        gonggongsheshiService.insert(gonggongsheshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GonggongsheshiEntity gonggongsheshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gonggongsheshi);
        gonggongsheshiService.insert(gonggongsheshi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GonggongsheshiEntity gonggongsheshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gonggongsheshi);
        gonggongsheshiService.updateById(gonggongsheshi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gonggongsheshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
