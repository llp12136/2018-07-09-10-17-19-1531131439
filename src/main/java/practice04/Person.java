package practice04;

public class Person {
    public String name;
    public int age;
    public  Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){

        return ("My name is "+name+". I am "+age+" years old.");
    }
}
