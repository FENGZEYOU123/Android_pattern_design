package com.yfz.main.creationalPattern.build.foodProduct;

import com.yfz.main.creationalPattern.build.foodItem.FoodDrink;

/**
 * 雪碧-食物商品-饮料-的具体实现类
 */
public class SpriteDrink extends FoodDrink {
    @Override
    public String foodName() {
        return "雪碧";
    }

    @Override
    public float foodPrice() {
        return 10;
    }
}
