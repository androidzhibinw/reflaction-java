package com.zhibinw.example;

public class UserClass {

    public UserClass() {
    }
    
    public static void main (String [] args) {
        Wrapper app = Wrapper.getInstance();
        int a = 1000;
        String bString = null;
        Object object=null;
        object = app.runMethod("com.zhibinw.example.CoreClass","getValue");
        System.out.println("getValue:" + object);
        object = app.runMethod("com.zhibinw.example.CoreClass","add",5,6);
        System.out.println("5+6=" + object);
        object = app.runMethod("com.zhibinw.example.CoreClass","addString","hello","world");
        System.out.println("addString:" + object);
    }

}
