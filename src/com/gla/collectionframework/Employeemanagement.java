package com.gla.collectionframework;

import java.util.ArrayList;

class Emploee{
    private String name;
    private String id;
    private String email;

    public Emploee(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Employeemanagement {
    public static void main(String[] args) {
        Emploee e1 = new Emploee("VISHNU", "1001", "VISHNU@gmail.com");
        Emploee e2 = new Emploee("VISHNU 1", "1002", "VISHNU1@gmail.com");
        Emploee e3 = new Emploee("VISHNU 2", "1002", "VISHNU2@gmail.com");
        Emploee e4 = new Emploee("VISHNU 3", "1003", "VISHNU2@gmail.com");
        ArrayList<Emploee> al   = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        System.out.println(al);
        for(Emploee e : al){
            System.out.println(e);
            // agar object e2 me se name change karna h
          
        }
        Emploee updatedEmp = new Emploee("KARAN" ," 1002", " KARAN@gmail.com");
        al.set(2,updatedEmp);
        System.out.println(al);
    }
}
