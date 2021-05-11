package InheritanceExercise;

public class Computer {

    private boolean screen = true;
    private double hardDrive;
    private String processorSpeed;
    private String brand;

    public Computer (double aHardDrive, String aProcessorSpeed, String aBrand) {
        hardDrive = aHardDrive;
        processorSpeed = aProcessorSpeed;
        brand = aBrand;
    }
    /**** Getters and Setters ****/
    public double getHardDrive() {
        return hardDrive;
    }
    public String getProcessorSpeed() {
        return processorSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public void setHardDrive(double aHardDrive) {
        hardDrive = aHardDrive;
    }
    public void setProcessorSpeed(String aProcessorSpeed) {
        processorSpeed = aProcessorSpeed;
    }
    public void setBrand(String aBrand) {
        brand = aBrand;
    }

}
