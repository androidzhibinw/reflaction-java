package com.zhibinw.example;

public class CoreClass {
    private int mValue =100;

    public  CoreClass() {
    }
    public  CoreClass(int value) {
        mValue = value;
    }
    
    public int  getValue(){
        return mValue;
    }
    public int  setValue(int value){
        mValue = value;
        return mValue;
    }
    public int add(int a, int b) {
        return a+b;
    }
    public String addString( String a, String b) {
        return a+b;
    }

}
