package design.patterns.creational.builder;
/**
 * @author nayanava
 */

public class Computer {
    private String company;
    private String os;
    private String model;
    private String yearOfManufacture;
    private String RAM;
    private String chipSet;

    public Computer(String company,
                    String os,
                    String model,
                    String yearOfManufacture,
                    String RAM,
                    String chipSet) {
        this.company = company;
        this.os = os;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.RAM = RAM;
        this.chipSet = chipSet;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", RAM='" + RAM + '\'' +
                ", chipSet='" + chipSet + '\'' +
                '}';
    }
}
