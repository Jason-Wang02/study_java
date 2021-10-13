package study;

import java.util.Scanner;

public class 实验 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int num1=scanner.nextInt();
        String op=scanner.next();
        int num2=scanner.nextInt();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        calculator.setOp(op);
        System.out.println(calculator.cal());
    }
}

class Calculator {
    private int num1;
    private int num2;
    private String op;

    public Calculator() {
    }

    public Calculator(int num1, int num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOp() {
        return op;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public int cal()
    {
        int t = 0;
        switch (op){
            case "+":
                t=num1+num2;
                break;
            case "-":
                t=num1-num2;
                break;
            case "*":
                t=num1*num2;
                break;
            case "/":
                t=num1/num2;
                break;
            default:;
        }
        return t;
    }
}

