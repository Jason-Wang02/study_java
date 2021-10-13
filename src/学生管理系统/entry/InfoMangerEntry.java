package 学生管理系统.entry;

import 学生管理系统.controller.StudentController;

import java.util.Scanner;

public class InfoMangerEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {//主菜单
            System.out.println("欢迎来到信息管理系统");
            System.out.println("请输入您的选择1.学生管理2.老师管理3.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:;
            }
        }
    }
}
