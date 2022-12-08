public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase,theMonitor,theMotherboard);

        thePC.getMonitor().drawPixelAt(10,10,"red"); // PersonalComputer object calls local method whose function is to call the getMonitor class
                                                                    // then calls the drawPixelAt method of the getMonitor class
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().pressPowerButton();
        //all the above stuff only applicable when using the getters and not further hiding the functionality as below...

        System.out.println("===============");

        thePC.powerUp(); //this is composition: creating objects within objects where nothing needs to be known about the parts of the PC
                        //in general, composition used more frequently than inheritance. Is more flexible with adding and removing parts
        //composition provides functional reuse outside of the class hierarchy, meaning classes can share attributes and behavior by having
        // similar components instead of inheriting functionality from a parent or base class
        //java inheritance breaks encapsulation because subclasses may need direct access to a parents state or behavior
        //inheritance is less flexible in that adding or removing a class or hierarchy may impact all subclasses. a new subclass may also not need
        //all the functionality or attributes of its parent class
    }
}