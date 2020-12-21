package Calculator;

import Calculator.operations.addOperation;
import Calculator.operations.divideOperation;
import Calculator.operations.multiplyOperation;
import Calculator.operations.subtractoperation;

import java.util.Scanner;

public class InteractiveCalculator {

    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number A please");
        int numberA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me a number B please:");
        int numberB = scanner.nextInt();
        System.out.println("Give me a operation please:");
        scanner.nextLine();
        String operation = scanner.nextLine();

        int result = 0;
        if (operation.equals("add")) {
            addOperation add = new addOperation();
            add.setA(numberA);
            add.setB(numberB);
            result = add.getResult();
        } else if (operation.equals("Subtract")) {
            subtractoperation subtract = new subtractoperation();
            subtract.setA(numberA);
            subtract.setB(numberB);
            result = subtract.getResult();
        } else if (operation.equals("Multiply")) {
            multiplyOperation multiply = new multiplyOperation();
            multiply.setA(numberA);
            multiply.setB(numberB);
            result = multiply.getResult();
        } else if (operation.equals("Divide")) {
            divideOperation divide = new divideOperation();
            divide.setA(numberA);
            divide.setB(numberB);
            result = divide.getResult();
        } else {
            System.out.println("Did not understand operation");
        }
        System.out.println("The result is");
        System.out.println(result);
    }
}
