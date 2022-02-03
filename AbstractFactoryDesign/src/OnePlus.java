public class OnePlus extends Device{
    String ram;
    String processor;

    public OnePlus(String ramSize, String processorType){
        this.ram = ramSize;
        this.processor = processorType;
    }

    @Override
    public String getDetails() {
        return "OnePlus config is " + ram + "gb and " + processor + " processor.";
    }
}
