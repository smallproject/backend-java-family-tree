import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Pet pet;
    @BeforeEach
    void setUp() {
        pet = new Pet("Brown", 2, "Samojeed");
    }

    @Test
    void canGetName() {
        //Arrange
        var name = "Berk";

        //Act
        pet.setName(name);

        //Assert
        assertEquals(name, pet.getName());
    }

    @Test
    void canSetName() {
        //Arrange
        var name = "Barkley";

        //Act
        pet.setName(name);

        //Assert
        assertEquals(name, pet.getName());
    }

    @Test
    void canGetAge() {
        //Arrange
        var age = 5;

        //Act
        pet.setAge(age);

        //Assert
        assertEquals(age, pet.getAge());
    }

    @Test
    void canSetAge() {
        //Arrange
        var age = 6;

        //Act
        pet.setAge(age);

        //Assert
        assertEquals(age, pet.getAge());
    }

    @Test
    void canGetSpecies() {
        //Arrange
        var species = "Labrador";

        //Act
        pet.setSpecies(species);

        //Assert
        assertEquals(species, pet.getSpecies());
    }

    @Test
    void cansetSpecies() {
        //Arrange
        var species = "Saint Bernard";

        //Act
        pet.setSpecies(species);

        //Assert
        assertEquals(species, pet.getSpecies());
    }

    @Test
    void canGetOwner() {
        //Arrange
        var owner = new Person("Mike", "Millers", 29, "Male");

        //Act
        pet.setOwner(owner);

        //Assert
        assertEquals(owner, pet.getOwner());
    }

    @Test
    void canSetOwner() {
        //Arrange
        var owner = new Person("Richard", "Millers", 19, "Male");

        //Act
        pet.setOwner(owner);

        //Assert
        assertEquals(owner, pet.getOwner());
    }
}