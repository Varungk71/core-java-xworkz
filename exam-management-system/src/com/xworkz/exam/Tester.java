package com.xworkz.exam;


class Parent
{
    public void business()
    {
        System.out.println("Agriculture");
    }

}

class Child extends Parent
{
    @Override
    public void business()
    {
        System.out.println("organic farming");
    }
    public void videoCreator()
    {

    }
}
public class Tester
{
    public static void main(String[] args)
    {
        // polymorphism
        Parent parent=new Child();
        parent.business();l

        // up casting
        Parent parent1=new Child();
        parent.business();

        //down casting
        // invoke the child method by the parent reference
        Child child=(Child) parent;
        child.videoCreator();





    }



}
