package practice05;

import practice02.Person;

public class Student extends Person {

    private int klass;

    public int getKlass() {
        return this.klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public  Student(String name,int age,int klass){
        super(name,age);
        this.klass=klass;
    }
    @Override
    public String introduce(){
        //super.introduce();
        //System.out.println("I am a Student. I am at Class"+klass+".");
        return  super.introduce()+" I am a Student. I am at Class "+klass+".";
    }
}
