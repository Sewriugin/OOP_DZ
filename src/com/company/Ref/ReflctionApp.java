package com.company.Ref;

import java.lang.reflect.*;
import java.util.Arrays;

class ReflectionApp {
    public static void main(String[] args) {

//1 вариант
        //People p = new People();
        //Class clazz  = p.getClass();

        //2 вариант
//        Class clazz = People.class;
//        classProperty(clazz);

        //3 вариант
        try {
            Class clazz = Class.forName("com.company.Ref.People");
            Constructor constructor = clazz.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            Object p = (People) constructor.newInstance("Artem");
            Method method = clazz.getMethod("getName");
            //System.out.println(p.getName());
            System.out.println(method.invoke(p));

            Field field = clazz.getField("MAX_COUNT");
            System.out.println(field.get(p));
            field.setAccessible(true);
            field.set(p, 20);
        }catch (NoSuchFieldException ex) {
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (NoSuchMethodException ex){
            ex.printStackTrace();
        }catch (IllegalAccessException ex){
            ex.printStackTrace();
        }catch (InstantiationException ex){
            ex.printStackTrace();
        }catch (InvocationTargetException ex){
            ex.printStackTrace();
        }
    }



    //Class clazz = Class.forName("reflection");


    private static void getClassConstructor(Class clazz) {
    }

    public static void classProperty(Class clazz) {
        //System.out.println(clazz.getName());
        System.out.println(clazz.getFields());
    }
    public static void getClassFields(Class clazz){
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String type = field.getType().getSimpleName();
            String name = field.getName();
            int mod = field.getModifiers();
            String modifiers = Modifier.toString(mod);
            System.out.println(modifiers + " " + type + " " + name);
        }
    }
    public static void getClassConstructors(Class clazz){
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            String name = constructor.getName();
            int mod = constructor.getModifiers();
            String modifiers = Modifier.toString(mod);
            Parameter[] parameters = constructor.getParameters();
            String[] params = new String[parameters.length];
            int i = 0;
            for (Parameter parameter: parameters) {
                params[i] = parameter.getType().getSimpleName()+" "+parameter.getName();
                i++;
            }
            System.out.println(modifiers+" "+name+"("+ Arrays.toString(params)+")");
        }
    }



    public static void getClassMethods(Class clazz){
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            String name = method.getName();
            int mod = method.getModifiers();
            String modifiers = Modifier.toString(mod);
            String retType = method.getReturnType().getSimpleName();

            int i = 0;
            Parameter[] parameters = method.getParameters();
            String[] params = new String[parameters.length];
            for(Parameter parameter: parameters){
                params[i] = parameter.getType().getSimpleName()+ " " + parameter.getName();
                i++;
            }
            System.out.println(modifiers+" "+retType+" "+name+"("+Arrays.toString(params)+")");
        }
    }




}



class People{
    private String name;
    public int age;
    protected static int count;
    public static final int MAX_COUNT = 10;

    public People(){}

    private People(String name){
        this.name = name;
    }

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static String say(){
        return "Hello";
    }

    private  void go(){
        System.out.println("Go-go-go");
    }
};
