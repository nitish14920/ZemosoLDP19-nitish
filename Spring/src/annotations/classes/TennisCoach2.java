package annotations.classes;

import annotations.interfaces.Coach;
import annotations.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach2 implements Coach {

    private FortuneService fortuneService;



    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyPlan() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    public void postConstruct(){
        System.out.println("Post Construct");
    }

    public void preDestroy(){
        System.out.println("PreDestroy");
    }
}

