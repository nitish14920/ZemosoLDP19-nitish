package demo.Classes;

import demo.Interfaces.*;

public class Hockey implements Coach {

    private FortuneService fortuneService;

    private String email;
    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {

        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyPlan() {
        return "Practice Hockey!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add init method
    public void initMethod(){
        System.out.println("Init Method");
    }

    //add dest method
    public void  destroyedMethod(){
        System.out.println("Destroyed Method");
    }
}
