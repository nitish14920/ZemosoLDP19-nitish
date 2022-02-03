public class Dell extends Device{

    private String ram;
    private String processor;
    private String gpu;

    public Dell(String ramSize,String processorType ,String gpuType){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu = gpuType;
    }
    @Override
    public String getDetails() {
        return "Dell config is " + ram + " and " + processor + " processor with " + gpu + " gpu.";
    }
}
