package demo.Classes;

import demo.Interfaces.*;


public class BasketBall implements Coach {

    private FortuneService fortuneService;

    public BasketBall(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyPlan() {
        return "Practice Dribbling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
