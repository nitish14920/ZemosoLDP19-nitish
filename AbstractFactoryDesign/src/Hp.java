public class Hp extends Device{
    private String ram;
    private String processor;
    private String gpu;

    public Hp(String ramSize, String processorType ,String gpuType){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu =gpuType;
    }
    @Override
    public String getDetails() {
        return "HP config is " + ram + "gb and " + processor + " processor with " + gpu + " gpu.";
    }
}
