package study;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class link {
    public static void main(String[] args) {
        testList testList = new testList();
    }
}

class testList{
    MyArrayList myArrayList =new MyArrayList();
    Scanner sc =new Scanner(System.in);

    public testList() {
        System.out.println("1.线性表的初始化");
        System.out.println("2.线性表的插入");
        System.out.println("3.查找线性表中元素");
        System.out.println("4.遍历线性表");
        System.out.println("5.删除线性表中元素");
        System.out.println("6.输出线性表的长度");
        System.out.println("7.线性表判空");
        System.out.println("8.清空线性表");
        System.out.println("9.替换线性表中元素");
        System.out.println("10.获取线性表中元素");
        System.out.println("11.判断线性表中是否含有输入的数字");
        System.out.println("12.反向查找某一元素");
        System.out.println("13.向线性表末尾插入某一元素");
        System.out.println("14.退出");

        while(true)
        {
            int flag=0;
            flag=sc.nextInt();
            switch(flag)
            {
                case 1:
                    myArrayList.init();
                    break;
                case 2:
                    myArrayList.insert();
                    break;
                case 3:
                    myArrayList.find();
                    break;
                case 4:
                    myArrayList.run();
                    break;
                case 5:
                    myArrayList.delete();
                    break;
                case 6:
                    myArrayList.length();
                    break;
                case 7:
                    myArrayList.empty();
                    break;
                case 8:
                    myArrayList.clear();
                    break;
                case 9:
                    myArrayList.replace();
                    break;
                case 10:
                    myArrayList.get();
                    break;
                case 11:
                    myArrayList.bool();
                    break;
                case 12:
                    myArrayList.ufind();
                    break;
                case 13:
                    myArrayList.add();
                    break;
                case 14:
                    System.exit(0);
                default:
                    System.out.println("您的输入不合法");
            }
        }
    }
    //线性表的初始化、插入 、查找、遍历线性表、删除、返回线性表长度、线性表判空、清空线性表、替换、获取元素、判断线性表中是否包
    //含某个元素、反向查找、末尾插入元素
}

class MyArrayList{
    Scanner sc=new Scanner(System.in);
    private String data;
    private int size=0;
    private int CAPACITY;
    private int[] ne=new int[1000];
    private int[] num=new int[1000];
    int h=-1;
    int st=0;
    public void init(){
        System.out.println("请输入元素数量");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            add();
        }
    }
    public void insert(){
        System.out.println("请输入要往哪一个位置插入多少");
        int n=sc.nextInt();
        int m=sc.nextInt();
        num[st]=m;
        ne[st]=ne[n];
        ne[n]=st++;
    }
    public void find(){
        System.out.println("请输入要查找多少");
        int n=sc.nextInt();
        int cnt=0;
        for(int i=h;i!=-1;i=ne[i])
        {
            int t=num[i];
            cnt++;
            if(t==n)
            {
                System.out.println("该元素出现在第"+cnt+"个位置上");
                break;
            }
        }
    }
    public void run(){
        for(int i=h;i!=-1;i=ne[i])
        {
            System.out.println(num[i]);
        }
    }
    public void delete(){
        System.out.println("请输入要删除哪一个元素");
        int n=sc.nextInt();
        if(n==0) {
            h=ne[h];
        } else{
            ne[n]=ne[ne[n]];
        }
        size--;
    }
    public void length(){
        System.out.println(size);
    }
    public void empty(){
        if(size==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public void clear(){
        h=-1;
        st=0;
    }
    public void replace(){
        System.out.println("请输入要将第几个元素置为多少");
        int cnt=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=-1;i!=-1;i=ne[i])
        {
            cnt++;
            if(cnt==n)
            {
                num[i]=m;
                break;
            }
        }
    }
    public void get(){
        System.out.println("请输入要获取哪一个元素");
        int n=sc.nextInt();
        extracted(n, ne);
    }

    private void extracted(int n, int[] ne) {
        int cnt=0;
        for(int i=-1;i!=-1;i= ne[i])
        {
            cnt++;
            if(cnt== n)
            {
                System.out.println(num[i]);
                break;
            }
        }
    }

    public void bool(){
        System.out.println("请输入寻找哪一个元素");
        int n=sc.nextInt();
        int flag=1;
        for(int i=-1;i!=-1;i=ne[i])
        {
            if(num[i]==n)
            {
                System.out.println("YES");
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("NO");
        }
    }
    public void ufind(){
        System.out.println("请输入寻找哪一个元素");
        int n=sc.nextInt();
        int flag=1;
        for(int i=-1;i!=-1;i=ne[i])
        {
            if(num[i]==n)
            {
                System.out.println("YES");
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("NO");
        }
    }
    public void add(){
        System.out.println("请输入元素");
        int a=sc.nextInt();

        ne[st]=h;
        num[st]=a;
        h=st++;
        size++;
    }
}
