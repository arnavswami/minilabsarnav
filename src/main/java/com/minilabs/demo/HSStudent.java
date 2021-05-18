package com.minilabs.demo;

public class HSStudent extends Student {
    int gradeLevel;
    public HSStudent(){
        super("HS NO NAME");
        gradeLevel = 9;
    }
    public HSStudent(String n, int l) {
        super(n);
        gradeLevel = l;
    }
    @Override
    public Boolean registerforclass(String className) {
        System.out.println("Registering " + name + " for " + className + " in grade " + gradeLevel);
        if (getParentApproval()) {
            System.out.println("I got parent approval now I need to get counselor approval.");
            if (getCounselorApprval()) {
                System.out.println("Got all approvals");
                System.out.println("Registration successful");
                return Boolean.TRUE;
            }
        }
        System.out.println("Registration unsuccessful for" + className);
        return Boolean.FALSE;
    }

    public Boolean getCounselorApprval() {
        return Boolean.TRUE;
    }
}

