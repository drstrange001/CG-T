package com.company;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "File Persistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Database Persistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {}
}