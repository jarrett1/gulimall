package com.atguigu.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.sms.entity.SpuBoundsEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author liushaojun
 * @email liushaojun1314@126.com
 * @date 2019-08-01 20:07:00
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

