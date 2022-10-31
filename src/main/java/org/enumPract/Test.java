package org.enumPract;

public class Test {
    EnumPract.Day day;

    public Test (EnumPract.Day day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println(" Today is monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case SUNDAY:
                System.out.println("today is sunday");
                break;
            case FRIDAY:
                System.out.println("Today is friday");
                break;
            case SATURDAY:
                System.out.println("today is saturday");
                break;
            case THURSDAY:
                System.out.println("today is thursday");
                break;
            case WEDNESDAY:
                System.out.println("Today is wednesday");
            default:
                System.out.println("in mid of nothing");
                break;
        }
    }
}
