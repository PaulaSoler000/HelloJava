import java.util.ArrayList;
import java.util.List;

public class grogu {
    String holA2;
    public static void main(String[] args) {
        String hola ="";
        int holaInt = 1;
        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        myList.get(1);
        myList.set(1,7);

        myList.remove(1);


        if(myList.contains(2)){
            System.out.println("contiene 2");
        }else{
            System.out.println("no contiene 2");
        }

        System.out.println(myList);
//
//        for (int i =0; i<myList.size(); i++){
//            if(myList.get(i)==2){
//
//
//            }
//
//            if(myList.contains(8)){
//
//            }
//        }

//        for (int i=0; i<myList.size(); i++){
//            if(myList.get(i)==8){
//
//
//            }
//
//        }
//
//
        for (int i=0; i<myList.size(); i++){
            if(myList.get(i)%2==1){
                myList.set(i,2);
            }
        }

        System.out.println(myList);

//        myList.clear();




//        char caracter = 'a';

//        if (hola==""){
//            System.out.println("esta vacio");
//
//        }else if (hola!=""){
//            System.out.println("no esta vacio");
//        }
//
//        for (int i =0; i<10; i++){
//            System.out.println("esta vacio");
//
//        }

//        for (int i =0; i<5; i++){
//
//            if (hola==""){
//                System.out.println("esta vacio");
//
//            }
//
//            if (i==3){
//                hola = hola +"a";
//            }
//
//            if (hola!=""){
//                System.out.println(hola);
//            }
//
//        }
//
//
//
    }
}
