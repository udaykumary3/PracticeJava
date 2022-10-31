package org.enumPract;

public class SamplePractice {
    int number;
    String name;
    float percentage;

    public SamplePractice(int number, String name, float percentage){
        this.name = name;
        this.number = number;
        this.percentage = percentage;
    }

    public void usageOfVariables(){
        float value = number/percentage;
        System.out.println("value of operation done is "+ value + " and name entered is "+name);
    }

}
