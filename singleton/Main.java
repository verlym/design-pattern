package singleton;

public class Main {
    public static void main(String[] args) {
        Employee graham = new Employee("Graham",
                "CEO",
                "Making excutive decisions");
        Employee sara = new Employee("Sara",
                "Consultant",
                "Consuting the company");
        Employee tim = new Employee("Tim",
                "Salesmen",
                "Selling the company's products");
        Employee emma = new Employee("Emma",
                "Developer",
                "Developing the latest mobile app.");
        graham.printCurrentAssignment();
        sara.printCurrentAssignment();
        tim.printCurrentAssignment();
        emma.printCurrentAssignment();
    }
}