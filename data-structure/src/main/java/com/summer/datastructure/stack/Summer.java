package com.summer.datastructure.stack;


public class Summer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Summer{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Summer create(String name){
        Summer summer = new Summer();
        summer.setName(name);
        return summer;
    }
}
