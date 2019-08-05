package com.atguigu.gulimall.pms.service;

import com.atguigu.gulimall.pms.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.SkuInfoEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;

import java.util.List;


/**
 * sku信息
 *
 * @author liushaojun
 * @email liushaojun1314@126.com
 * @date 2019-08-01 19:57:11
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);

    List<SpuInfoEntity> queryGoodsByCondition(QueryCondition queryCondition, long catId);
}

