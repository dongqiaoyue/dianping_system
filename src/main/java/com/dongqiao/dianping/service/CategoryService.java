package com.dongqiao.dianping.service;

import com.dongqiao.dianping.common.BusinessException;
import com.dongqiao.dianping.model.CategoryModel;

import java.util.List;

public interface CategoryService {

    CategoryModel create(CategoryModel categoryModel) throws BusinessException;
    CategoryModel get(Integer id);
    List<CategoryModel> selectAll();

    Integer countAllCategory();
}
