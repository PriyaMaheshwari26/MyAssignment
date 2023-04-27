package com.company.oops;

class SingletonInheritanceCheck{
    private static SingletonInheritanceCheck instance;//=null(Optional) by default null
    public static SingletonInheritanceCheck getInstance(){
        if(instance==null){
            instance=new SingletonInheritanceCheck();
        }
        return instance;
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck obj=SingletonInheritanceCheck.getInstance();
        SingletonInheritanceCheck obj1= SingletonInheritanceCheck.getInstance();
        if(obj1==obj){
            System.out.println("Class is Singleton");
        }
        else System.out.println("Not a Singleton class");
    }

}

