package annotations.classes;

import annotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Fortune 1",
            "Fortune 2",
            "Fortune 3",
            "Fortune 4"
    };

    private Random random = new Random();
    @Override
    public String getFortune() {

        int index = random.nextInt(data.length);
        return data[index];
    }
}
