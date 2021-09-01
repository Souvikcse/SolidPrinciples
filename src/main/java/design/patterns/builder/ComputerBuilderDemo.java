package design.patterns.builder;
/**
 * @author nayanava
 */

public class ComputerBuilderDemo {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .company("Lenovo")
                .model("Thinkpad Yoga X1")
                .os("Windows 10")
                .RAM("32GB")
                .yearOfManufacture("2021")
                .chipSet("Intel Core i9 5th Generation")
                .build();

        System.out.println(computer);
    }
}
