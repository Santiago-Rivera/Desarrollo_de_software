package Main;

import java.util.ArrayList;

import java.util.List;

public class main {
    /**
    public static void main
    */{
        // Hola mundo

        System.out.println("Hola, Java!");

        String myString = "Esto es una cadena de texto";
        myString = "Aqui cambio el valor de la cadena de texto";
        System.out.println(myString);

        int myInt = 3;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        Double myDouble = 3.9;
        System.out.println(myDouble);

        Float myFloat = 7.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + " " + myString + " " + myFloat + " " + myInt);

        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        myFloat = 7.9f;
        System.out.println(myFloat + 10);
        System.out.println("My Float es nulo");
        if (myInt == 11){
            System.out.println("myInt == 11");
        } else {
            System.out.println("El valor no es ni 11 ni 12");
        }

        List<String> myList = new ArrayList<>();
        myList.add(myString);
        myList.add(myList.toString());
        System.out.println(myList);

        for (int index = 0; index < myList.size(); index++){
            System.out.println(myList.get(index));
        }


    }
}
