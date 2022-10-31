package org.enumPract;

public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        Test test = new Test(EnumPract.Day.valueOf(day.toUpperCase()));
        test.dayIsLike();

        SamplePractice sa = new SamplePractice(20,"uday",10);
        sa.usageOfVariables();

//        SamplePrivateVariables privateTest = new SamplePrivateVariables(21, "Nani", 2.5f, "Yakala");
//        privateTest.usageOfPrivateVariables();
//
//        SamplePrivateVariables privateVariables = new SamplePrivateVariables();
//        privateVariables.setLastName("Uday");
//        String name = privateVariables.getLastName();
//        System.out.println(name);

        ObjectCreation obj = new ObjectCreation();
        ObjectCreation obj2 = new ObjectCreation();
        ObjectCreation obj3 = new ObjectCreation();
        System.out.println("number of times object created for this class is "+ObjectCreation.count);
    }
}
