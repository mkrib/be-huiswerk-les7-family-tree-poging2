package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void getNameTest() {
        //        Arrange
        Pet sut = new Pet("Lennie", 1, "dog");
//        Act
        String name = sut.getName();
//        Assert
        assertEquals("Lennie", name);
    }

    @Test
    void getAge() {
    }

    @Test
    void getSpecies() {
    }

    @Test
    void getOwner() {
    }

    @Test
    void setName() {
    }

    @Test
    void setAge() {
    }

    @Test
    void setSpecies() {
    }

    @Test
    void setOwner() {
    }
}