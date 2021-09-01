package design.patterns.builder;
/**
 * @author nayanava
 */

public class ComputerBuilder {
    private String company;
    private String os;
    private String model;
    private String yearOfManufacture;
    private String ram;
    private String chipSet;

    public ComputerBuilder() {

    }
    public ComputerBuilder company(String company) {
        this.company = company;
        return this;
    }
    public ComputerBuilder os(String os) {
        this.os = os;
        return this;
    }
    public ComputerBuilder model(String model) {
        this.model = model;
        return this;
    }
    public ComputerBuilder yearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }
    public ComputerBuilder RAM(String ram) {
        this.ram = ram;
        return this;
    }
    public ComputerBuilder chipSet(String chipSet) {
        this.chipSet = chipSet;
        return this;
    }

    public Computer build() {
        return new Computer(this.company, this.os, model, yearOfManufacture, ram, chipSet);
    }
}
