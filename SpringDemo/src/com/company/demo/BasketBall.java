package com.company.demo;

public class BasketBall implements Coach{
    @Override
    public String getDailyPlan() {
        return "Practice Dribbling";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
