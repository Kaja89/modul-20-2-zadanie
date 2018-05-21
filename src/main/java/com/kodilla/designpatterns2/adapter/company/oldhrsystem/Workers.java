package com.kodilla.designpatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"37468761", "John", "Smith"},
            {"38014800", "Ivone", "Novak"},
            {"32784398", "Jessie", "Pinkman"},
            {"32784398", "Walter", "White"},
            {"32784398", "Clara", "Lanson"}
    };

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorker(int n){
        if(n> salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers(){
        return workers;
    }

    public double[] getSalaries(){
        return salaries;
    }
}
