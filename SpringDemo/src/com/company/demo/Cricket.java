package com.company.demo;

public class Cricket implements Coach{

    private FortuneService fortuneService;

    public Cricket(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyPlan() {
        return "Practice Batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
