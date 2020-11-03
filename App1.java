package com.genius;

public class App1
{

    public static void main(String [] args)
    {
        //-- i created an objected of class car "i created new car" named car1. and gave it a return type of String --\\
        //-- i accessed the typeOfcar, which is the method inside the car class, the i gave it a field of type string--\\
        car<String> car1 = new car();
        {
            System.out.println("Your car's name is ".toUpperCase() + " " + car1.typeOfcar("toyota venza".toUpperCase()));
        }

        //-- i created an objected of class car "i created new car" named car2. and gave it a return type of integer --\\
        //-- i accessed the amountOfcar, which is the method inside the car class , the i gave it a field of type integer--\\
        car<Integer> car2 = new car();
        {
            System.out.println("Your amount of car is".toUpperCase() + " " + car2.amountOfcar(5));
        }

        //-- i created an objected of class car "i created new car" named car3. and gave it a return type of boolean --\\
        //-- i accessed the driveable, which is the method inside the car class , the i gave it a field of type boolean--\\
        car<Boolean> car3 = new car();
        {
            System.out.println(car3.driveable(false));
        }

    }

}

//-- i created a class here with a return type, and the return type is unknown yet, so we gave it a genetics "nick-name"--\\
class car <y>
{
    //-- method 1
    public y typeOfcar(y carName)
    {
        y rett;
        rett = carName;
        return rett;
    }

    //methods 2
    public y amountOfcar(y size)
    {
        y rett2;
        rett2 = size;
        return rett2;
    }

    //methods 3
    public y driveable(y yes)
    {
        y rett3;
        rett3 = yes;

        //checker, if we can drive or not
            if (yes.equals(true))
            {
                System.out.println("You can drive".toUpperCase());
            }
            else
                {
                    System.out.println("you can't drive ".toUpperCase());
                }
        return rett3;


    }

}
