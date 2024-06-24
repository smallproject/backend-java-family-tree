import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    private Pet pet;
    @BeforeEach
    void setUp() {
        person = new Person("Mitchel", "Rose", 36, "Female");
        pet = new Pet("gunther", 4,"Saint Bernard");
    }

    @Test
    void getName() {
        //Arrange
        var person = new Person("Martin", "Red", 36, "Male");

        //Act
        var name = person.getName();

        //Assert
        assertEquals("Martin", name);
    }

    @Test
    void setName() {
        //Arrange
        var person = new Person("Penny", "Lane", 36, "Female");

        //Act
        person.setName("Lesly");

        //Assert
        assertEquals("Lesly", person.getName());
    }

    @Test
    void getMiddleName() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        var middleName = person.getMiddleName();

        //Assert
        assertEquals("Blood", middleName);
    }

    @Test
    void setMiddleName() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        person.setMiddleName("Purple");

        //Assert
        assertEquals("Purple", person.getMiddleName());
    }

    @Test
    void getLastName() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        var lastName = person.getLastName();

        //Assert
        assertEquals("Red", lastName);
    }

    @Test
    void setLastName() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        person.setLastName("Tesla");

        //Assert
        assertEquals("Tesla", person.getLastName());
    }

    @Test
    void getSex() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        var sex = person.getSex();

        //Assert
        assertEquals("Male", sex);
    }

    @Test
    void setSex() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        person.setSex("Female");

        //Assert
        assertEquals("Female", person.getSex());
    }

    @Test
    void getAge() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        var age = person.getAge();

        //Assert
        assertEquals(36, age);
    }

    @Test
    void setAge() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");

        //Act
        person.setAge(32);

        //Assert
        assertEquals(32, person.getAge());
    }

    @Test
    void getMother() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var mother = new Person("Martha", "Blood","Red", 60, "Female");

        //Act
        person.setMother(mother);
        var getMother = person.getMother();

        //Assert
        assertEquals(mother, getMother);
    }

    @Test
    void setMother() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var mother = new Person("Martha", "Blood","Red", 60, "Female");

        //Act
        person.setMother(mother);

        //Assert
        assertEquals(mother, person.getMother());
    }

    @Test
    void getFather() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var father = new Person("Lewis", "Blood","Red", 63, "Male");
        person.setFather(father);

        //Act
        var getFather = person.getFather();

        //Assert
        assertEquals(father, getFather);
    }

    @Test
    void setFather() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var father = new Person("Lewis", "Blood","Red", 63, "Male");


        //Act
        person.setFather(father);

        //Assert
        assertEquals(father, person.getFather());
    }

    @Test
    void getSiblings() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var lewis = new Person("Lewis", "Blood","Red", 30, "Female");
        var mike = new Person("Mike", "Blood","Red", 32, "Male");
        var peter = new Person("Peter", "Blood","Red", 33, "Male");

        List<Person> siblings = new ArrayList<>();
        siblings.add(lewis);
        siblings.add(mike);
        siblings.add(peter);

        person.setSiblings(siblings);

        //Act
        var getSiblings = person.getSiblings();

        //Assert
        assertEquals(siblings, getSiblings);
    }

    @Test
    void setSiblings() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var lewis = new Person("Lewis", "Blood","Red", 30, "Female");
        var mike = new Person("Mike", "Blood","Red", 32, "Male");
        var peter = new Person("Peter", "Blood","Red", 33, "Male");


        //Act
        List<Person> siblings = new ArrayList<>();
        siblings.add(lewis);
        siblings.add(mike);
        siblings.add(peter);

        person.setSiblings(siblings);


        //Assert
        assertEquals(siblings, person.getSiblings());
    }

    @Test
    void getChildren() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var danna = new Person("Danna", "Blood","Red", 9, "Female");
        var liz = new Person("Liz", "Blood","Red", 6, "Male");
        var rick = new Person("Rick", "Blood","Red", 4, "Male");

        List<Person> children = new ArrayList<>();
        children.add(danna);
        children.add(liz);
        children.add(rick);

        //Act
        var getChildren = person.getChildren();


        //Assert
        assertEquals(children, getChildren);
    }

    @Test
    void setChildren() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var danna = new Person("Danna", "Blood","Red", 9, "Female");
        var liz = new Person("Liz", "Blood","Red", 6, "Male");
        var rick = new Person("Rick", "Blood","Red", 4, "Male");


        //Act
        List<Person> children = new ArrayList<>();
        children.add(danna);
        children.add(liz);
        children.add(rick);
        person.setChildren(children);


        //Assert
        assertEquals(children, person.getChildren());
    }

    @Test
    void getPets() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var brown = new Pet("brown",2, "Labrador");
        var husk = new Pet("husk", 3,"Samojeed");
        var gunther = new Pet("gunther", 4,"Saint Bernard");

        List<Pet> pets = new ArrayList<>();
        pets.add(husk);
        pets.add(gunther);
        pets.add(brown);
        person.setPets(pets);

        //Act
        var getPets = person.getPets();


        //Assert
        assertEquals(pets, getPets);
    }

    @Test
    void setPets() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var brown = new Pet("brown",2, "Labrador");
        var husk = new Pet("husk", 3,"Samojeed");
        var gunther = new Pet("gunther", 4,"Saint Bernard");

        List<Pet> pets = new ArrayList<>();
        pets.add(husk);
        pets.add(gunther);
        pets.add(brown);

        //Act
        person.setPets(pets);


        //Assert
        assertEquals(pets, person.getPets());
    }

    @Test
    void addParents() {
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var mother = new Person("Martha", "Blood","Red", 60, "Female");
        var father = new Person("Lewis", "Blood","Red", 65, "Male");


        //Act
        person.addParents(mother, father);


        //Assert
        assertEquals(mother, person.getMother());
        assertEquals(father, person.getFather());
    }

    @Test
    void addChild() {
        //need to fix
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var child = new Person("Lisa", "Blood","Red", 9, "Female");


        //Act
        person.addChild(child);


        //Assert
        assertEquals(1, person.getChildren().size());
    }

    @Test
    void addPet() {
        //need to fix
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var gunther = new Pet("gunther", 4,"Saint Bernard");


        //Act
        person.addPet(gunther,person);


        //Assert
        assertEquals(1, person.getPets().size());
    }

    @Test
    void addSibling() {
        //need to fix
        //Arrange
        var person = new Person("Martin", "Blood","Red", 36, "Male");
        var sibling = new Person("Mark", "Blood","Red", 39, "Male");


        //Act
        person.addSibling(sibling);


        //Assert
        assertEquals(1, person.getSiblings().size());
    }

    @Test
    void getGrandChildren() {
        //need to fix
        //Arrange
        var person = new Person("Martin", "Blood","Red", 64, "Male");
        var child = new Person("Betty", "Blood","Red", 39, "Female");;
        var grandchild = new Person("Mark", "Blood","Red", 9, "Male");
        child.addChild(grandchild);
        person.addChild(child);

        //Act
        var grandChildren = person.getGrandChildren();


        //Assert
        assertEquals(grandChildren, person.getGrandChildren());
    }
}