public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {                     //this stuff commented out to further hide functionality
                                                        //so the parts cannot be called from main method
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
}
