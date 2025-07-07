package com.workintech.developers;

public class HRManager extends Employee{
    private String[] juniorDeveloper;
    private String[] midDeveloper;
    private String[] seniorDeveloper;

    public HRManager(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR starts to working");
    }

    public void addEmployee(String[] employee){

    }


}
