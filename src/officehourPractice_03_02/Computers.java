package officehourPractice_03_02;

public class Computers {
    public static void main(String[] args) {
        String brand = "HP";
        String processor = "intel Core i5";
        int ramMemory = 12;
        int storageMemory = 4024;
        boolean hasMonitor = true;
        boolean hasWiFiCard = true;
        String description = "portable";
        double price = 995.0;
        String cpu = "I5 8250U";
        String color = "grey";
        int numberOfMonitors = 2;
        int numberOfUSBSlots = 3;
        boolean hasUSB = true;
        System.out.println("*********COMPUTER**********");

        System.out.println("Brand : " + brand);
        System.out.println("Processor : " + processor);
        System.out.println("Memory : " + ramMemory + " Ram");
        System.out.println("Storage Memory : " + storageMemory);
        System.out.println("Monitor :" + hasMonitor);
        System.out.println("WiFi :" + hasWiFiCard);
        System.out.println("Description:" + description);
        System.out.println("Price:  " + " $ " + +price);
        System.out.println("CPU : " + cpu);
        System.out.println("Color: " + color);
        System.out.println("Number of monitors : " + numberOfMonitors);
        System.out.println("number of USBlots: " + numberOfUSBSlots);
        System.out.println("It has USB: " + hasUSB);
        System.out.println("***********COMPUTER***************");

    }
}