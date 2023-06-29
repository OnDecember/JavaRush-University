package ua.javarush.task.jdk13.task11.task1113;

public class Laptop {

    private final String name;
    private final OperatingSystem os;

    public Laptop(String laptopName, String osName, String osVersion) {
        this.name = laptopName;
        this.os = new OperatingSystem(osName, osVersion);
    }

    public String getName() {
        return name;
    }

    public void updateOS(String version) {
        os.setVersion(version);
    }

    public void printInfo() {
        System.out.println("Laptop name: " + name + "\n" +
                            "OS Name: " + os.getName() + "\n" +
                            "OS Version: " + os.getVersion());
    }
}
