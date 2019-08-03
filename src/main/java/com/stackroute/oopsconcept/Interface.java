package com.stackroute.oopsconcept;
interface CargoPlane{
    void takeOff ();
    void land();
}
interface FighterPlane {
    void fly();
}
class Plane implements CargoPlane,FighterPlane {
    @Override
    public void takeOff()
    {
        System.out.println("plane is take off");
    }

    @Override
    public void land()
    {
        System.out.println("tke is landing");
    }

    @Override
    public void fly()
    {
        System.out.println("plane is flying");
    }
}
class Plane2 extends Plane implements CargoPlane{

    @Override
    public void takeOff()
    {
        System.out.println("cargoplane is takking off");

    }

    @Override
    public void land()
    {
        System.out.println("cargoplane is landing");
    }

    @Override
    public void fly()
    {
        System.out.println("fighter plane is flying");
    }
}

public class Interface
{
public static void main(String[] args)
{
 CargoPlane cargoPlane=new Plane();
    cargoPlane=new Plane2();
    cargoPlane.land();
    cargoPlane.takeOff();
    FighterPlane fighterPlane=new Plane();
    fighterPlane=new Plane2();
    fighterPlane.fly();

}
}
