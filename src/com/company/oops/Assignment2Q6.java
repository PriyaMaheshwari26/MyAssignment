package com.company.oops;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "Object in FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Object in DatabasePersistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
        FilePersistence obj1=new FilePersistence();
        System.out.println(obj1.persist());
        DatabasePersistence obj2=new DatabasePersistence();
        System.out.println(obj2.persist());
        Persistence obj=new FilePersistence();
        System.out.println(obj.persist());
    }
}

