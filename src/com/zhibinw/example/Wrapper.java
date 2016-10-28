
package com.zhibinw.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Wrapper {
    static Wrapper mInstance;

    private Wrapper() {
    }

    public static Wrapper getInstance() {
        if (mInstance == null) {
            mInstance = new Wrapper();
        }
        return mInstance;
    }

    public Object runMethod(Object... objects) {
        String className = (String) objects[0];
        String methodName = (String) objects[1];
        Object object = getInstance(className);
        Object ret = null;
        Method method = null;
        ArrayList<Class<?>> paraTypeList = new ArrayList<Class<?>>();
        ArrayList<Object> parameter = new ArrayList<Object>();
        for (int i = 2; i < objects.length; i++) {
            Class class1 = objects[i].getClass();
            if (class1.equals(Integer.class)) {
                paraTypeList.add(int.class);
            } else {
                paraTypeList.add(class1);

            }
            parameter.add(objects[i]);
        }
        try {
            method = object.getClass().getMethod(methodName,
                    paraTypeList.toArray(new Class<?>[objects.length - 2]));
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            ret = method.invoke(object, parameter.toArray(new Object[objects.length - 2]));
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ret;
    }

    public Class getClass(String name) {
        Class c = name.getClass();
        return c;
    }

    public Object getInstance(String name) {
        Class c = null;
        try {
            c = Class.forName(name);
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Object object = null;
        try {
            object = c.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return object;
    }

}
