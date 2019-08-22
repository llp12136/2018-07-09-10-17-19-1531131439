package practice06;


public class Teacher extends Person {

    private int klass;

    public int getKlass() {
        return this.klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public  Teacher(String name,int age){
        super(name,age);
    }

    public  Teacher(String name,int age,int klass){
        super(name,age);
        this.klass=klass;
    }
    @Override
    public String introduce(){
        //super.introduce();
        //System.out.println("I am a Student. I am at Class"+klass+".");
        if(klass==0)
            return  super.introduce()+" I am a Teacher. I teach No Class.";
        return  super.introduce()+" I am a Teacher. I teach Class "+klass+".";
    }
}