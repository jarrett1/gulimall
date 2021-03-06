package com.atguigu.gulimall.pms.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.Query;
import com.atguigu.gulimall.commons.bean.QueryCondition;

import com.atguigu.gulimall.pms.dao.CategoryDao;
import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.atguigu.gulimall.pms.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public List<CategoryEntity> listTreeCategoryByLevel(long level) {
        QueryWrapper<CategoryEntity> wrapper = null;
        if(level!=0){
            wrapper = new QueryWrapper<CategoryEntity>().eq("cat_level", level);
        }

        List<CategoryEntity> categoryEntities = baseMapper.selectList(wrapper);
        return categoryEntities;
    }

    @Override
    public List<CategoryEntity> listTreeCategoryChildrensById(long catId) {

        QueryWrapper<CategoryEntity> wrapper = new QueryWrapper<CategoryEntity>().eq("parent_cid", catId);
        return baseMapper.selectList(wrapper);
    }

}