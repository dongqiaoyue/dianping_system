package com.dongqiao.dianping.dal;

import com.dongqiao.dianping.model.CategoryModel;

import java.util.List;

public interface CategoryModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Jul 12 23:57:17 EDT 2022
     */
    int deleteByPrimaryKey(Integer id);

    List<CategoryModel> selectAll();
    Integer countAllCategory();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Jul 12 23:57:17 EDT 2022
     */
    int insert(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Jul 12 23:57:17 EDT 2022
     */
    int insertSelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Jul 12 23:57:17 EDT 2022
     */
    CategoryModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Jul 12 23:57:17 EDT 2022
     */
    int updateByPrimaryKeySelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Jul 12 23:57:17 EDT 2022
     */
    int updateByPrimaryKey(CategoryModel record);
}