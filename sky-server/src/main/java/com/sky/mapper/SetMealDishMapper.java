package com.sky.mapper;


import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetMealDishMapper {
    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */
    public List<Long> getSetMealIdByDishId(List<Long> dishIds);

    /**
     * 批量新建套餐内菜品
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据id批量删除套餐关联菜品
     * @param setmealIds
     */
    void deleteBatch(List<Long> setmealIds);
}
