package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        //        Arrange
        Person sut = new Person("Harry", "Huizen", 40, "Male");
//        Act
        String name = sut.getName();
//        Assert
        assertEquals("Harry", name);
    }

    @org.junit.jupiter.api.Test
    void getMiddleName() {
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
    }

    @org.junit.jupiter.api.Test
    void getSex() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void getMother() {
    }

    @org.junit.jupiter.api.Test
    void getFather() {
    }

    @org.junit.jupiter.api.Test
    void getSiblings() {
    }

    @org.junit.jupiter.api.Test
    void getChildren() {
    }

    @org.junit.jupiter.api.Test
    void getPets() {
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void setMiddleName() {
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
    }

    @org.junit.jupiter.api.Test
    void setSex() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @org.junit.jupiter.api.Test
    void setMother() {
    }

    @org.junit.jupiter.api.Test
    void setFather() {
    }

    @org.junit.jupiter.api.Test
    void setSiblings() {
    }

    @org.junit.jupiter.api.Test
    void setChildren() {
    }

    @org.junit.jupiter.api.Test
    void setPets() {
    }

    @org.junit.jupiter.api.Test
    void addParents() {
    }

    @org.junit.jupiter.api.Test
    void addChild() {
    }

    @org.junit.jupiter.api.Test
    void addPet() {
    }

    @org.junit.jupiter.api.Test
    void addSibling() {
    }

    @org.junit.jupiter.api.Test
    void getGrandChildren() {
    }
}