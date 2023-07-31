package com.mycompany.mainclass1;
public interface Speaker {
    void speak();
}
class Politician implements Speaker{
    @Override
    public void speak(){
        System.out.println("Talk politics");
    }
}
class Priest implements Speaker{
    @Override
    public void speak(){
        System.out.println("Religious Talks");
    }
}
class Lecturer implements Speaker{
    @Override
    public void speak(){
        System.out.println("Talks Object Oriented Design and Programming");
    }
}

