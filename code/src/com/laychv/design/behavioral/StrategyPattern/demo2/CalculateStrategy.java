package com.laychv.design.behavioral.StrategyPattern.demo2;

/**
 * 计算价格
 */
public interface CalculateStrategy {
    /**
     * 按距离计算价格
     *
     * @param km 公里
     * @return 价格
     */
    int calculatePrice(int km);
}
