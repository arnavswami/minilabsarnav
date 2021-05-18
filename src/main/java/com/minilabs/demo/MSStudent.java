package com.minilabs.demo;

public class MSStudent extends Student {

    int gradeLevel;

    public MSStudent(String n, int l) {
        super(n);
        gradeLevel = l;
    }
    @Override
    public Boolean registerforclass(String className) {
        System.out.println("Registering " + name + " for " + className + " in grade " + gradeLevel);
        if (getParentApproval()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
