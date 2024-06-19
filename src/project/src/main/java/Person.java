import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> Siblings;
    private List<Person> Children;
    private List<Pet> Pets;

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return Siblings;
    }

    public void setSiblings(List<Person> siblings) {
        Siblings = siblings;
    }

    public List<Person> getChildren() {
        return Children;
    }

    public void setChildren(List<Person> children) {
        Children = children;
    }

    public List<Pet> getPets() {
        return Pets;
    }

    public void setPets(List<Pet> pets) {
        Pets = pets;
    }



    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Person child) {
        this.Children.add(child);
    }

    public void addPet(Pet pet) {
        this.Pets.add(pet);
    }

    public void addSibling(Person sibling) {
        this.Siblings.add(sibling);
    }

    public List<Person> getGrandChildren() {
        //need to fix
        List<Person> grandChildren = new ArrayList<>();

        return grandChildren;
    }
}
