package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //    Attributen
    String name;
    String middleName;
    String lastName;
    String sex;
    int age;
    Person mother;
    Person father;
    List<Person> siblings;
    List<Person> children;
    List<Pet> pets;

//    Constructors

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

//    Getters en setters

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    //    Methodes
    static void addParents() {


    }

    static void addChild(){

    }

    static void addPet(){

    }

    static void addSibling(){

    }

    public List<Person> getGrandChildren() {
        List<Person> grandChildren = new ArrayList<>();
//        for (int i = 0; i < ; i++) {
//
//        }
        for (Person child : children) {
            for (Person grandChild : child.children) {
                grandChildren.add(grandChild);
            }
        }
        return grandChildren;
    }
}
