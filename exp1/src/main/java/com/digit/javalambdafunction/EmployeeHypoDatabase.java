package com.digit.javalambdafunction;

//import java.util.Arrays;
import java.util.List;

public class EmployeeHypoDatabase {

    static List<Employee>  getAllEmployees(){

        //Project info hypothetically
        Project p1=new Project("P111","HIS","Kentuncky","Himanshu");
        Project p2=new Project("P112","SCD","Almira","Darshana");
        Project p3=new Project("P113","BDA","Blackrock","Haideh");
        Project p4=new Project("P114","AUI","Zen tech","Preeti");
        Project p5=new Project("P115","MIS","Info tech","Chesala");
        Project p6=new Project("P116","ALPHA","Intel","John");
        Project p7=new Project("P117","BETTA","Softtech","Sampurna");
        Project p8=new Project("P118","GAMMA","Blackbox","Jeorge");
        Project p9=new Project("P119","SIOS","Symphony","Trumph");
        Project p10=new Project("P120","DARWIT","Pheonix","Payal");

        //Employee info hypothetically

        Employee e1=new Employee(1,"Sai","Development",40000, List.of(p1,p2));
        Employee e2=new Employee(2,"Sapan","Testing",50000, List.of(p3));
        Employee e3=new Employee(3,"Pramod","Underwriter",35000, List.of(p4));
        Employee e4=new Employee(4,"Musk","Development",20000, List.of(p5));
        Employee e5=new Employee(5,"James","Development",80000, List.of(p6));
        Employee e6=new Employee(6,"Robert","Development",75000, List.of(p7));
        Employee e7=new Employee(7,"Whitetakor","System Architect",60000, List.of(p8));
        Employee e8=new Employee(8,"Wasim","Quality Analyst",45000, List.of(p9));
        Employee e9=new Employee(9,"Rajat","Consultant",32000, List.of(p10));
        Employee e10=new Employee(10,"Janmajay","Devops",82000, List.of(p1));

        return List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);



    }
}
