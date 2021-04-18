package com.java.interview_questions;

import java.util.ArrayList;
import java.util.List;

public class SubstitutionPrincipleExample {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);
        buildings(new ArrayList<>());
//        List<Building> buildings = new ArrayList<>();
//        buildings.add(new Building());
//        buildings.add(new Office());
//        buildings(buildings);
//        List<Office> offices = new ArrayList<>();
//        offices.add(new Office());
//        buildings(offices);
    }

    public static void build(Building building) {
        System.out.println("Build " + building.toString());
    }
// Wild Card Principle
//    public static void buildings(List<? extends Building> buildings) {
//        buildings.forEach(System.out::println);
//    }

    public static void buildings(List<? super Building> buildings) {
        buildings.add(new Building());
        buildings.add(new Office());
        buildings.forEach(System.out::println);
    }


}

class Building {


    public String toString() {
        return "Building";
    }
}

class Office extends Building {


    public String toString() {
        return "Office";
    }
}
