package springdemo.mvc;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class Customer {
    @Min(value = 0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
    private int freePasses;

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
}
