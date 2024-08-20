import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) {

        //hola mundo

        System.out.println("Hola, Java!");

        //variables
        System.out.println("++++++++Variables+++++++");
        System.out.println("-------String------");
        String myString = "esto es una cadena de texto";
        myString = "aquí cambio el valor de la cadena de texto";
        System.out.println(myString);

        System.out.println("------Integer------");
        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        System.out.println("------Double------");
        Double myDouble = 6.5;
        Double myDouble2 = 6d;
        System.out.println(myDouble);
        System.out.println(myDouble2);

        System.out.println("------Float------");
        Float myFloat = 6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + " " + myString + " " + myFloat + " " + myInt);

        System.out.println(Double.valueOf(myFloat));

        System.out.println("------Boolean------");
        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        //constantes
        System.out.println("++++++++Constantes+++++++");
        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10);
            System.out.println("My Float es distinto de nulo");
        } else {
            System.out.println("My Float es nulo");
        }

        if (myInt == 11) {
            System.out.println("myInt == 11");
        } else if (myInt == 12) {
            System.out.println("myInt == 12");
        } else {
            System.out.println("El valor no es ni 11 ni 12");
        }


        // Listas
        System.out.println("++++++++Listas+++++++");
        List<String> myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList);


        // Mapas
        System.out.println("++++++++Mapas+++++++");
        Map<String, String> myMap = new HashMap();
        myMap.put("string", myString);
        myMap.put("int", myInt.toString());
        System.out.println(myMap);
        System.out.println(myMap.get("int"));


        // Bucles
        System.out.println("++++++++Bucles+++++++");
        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

        // Clases
        System.out.println("++++++++Clases+++++++");
        HelloWorld myMain = new HelloWorld();
        System.out.println(myMain.myFunction(5, 2));
        System.out.println(myMain.myFunction(3, 126389));
    }

    // Funciones

    public int myFunction(int myFirstNumber, int mySecondNumber) {
        return myFirstNumber + mySecondNumber;
    }
}
