public class Nokia extends Device{
    private String ram;
    private String processor;


    public Nokia(String ramSize,String processorType){
        this.ram = ramSize;
        this.processor = processorType;
    }

    @Override
    public String getDetails() {

        return "Nokia config is " + ram + "gb and " + processor + " processor.";
    }
}
