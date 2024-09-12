import java.util.ArrayList;
import java.util.List;

public class clasenueva {

    public static void main(String[] args) {
        List<String> myList = new ArrayList();

        myList.add("fruta2");
        myList.add("fruta3");
        myList.add("manzana");
        myList.add("fruta4");

        for (int i =0; i<myList.size(); i++){
            if(myList.get(i)=="manzana"){
                System.out.println(i);

            }

            if(myList.get(i).contains("fruta")){
                myList.set(i,"vacio");


            }




        }

        int y=0;
        List<String> myList2 = new ArrayList();

        for (String a: myList){
            if(a.contains("vacio")){
                myList.set(y,"fruta"+y);




//                myList2.add(a);

            }
            y++;

        }
        System.out.println(myList);
        System.out.println(myList2);

        String prueba = "fruta";
        int numero=1;

        prueba = prueba + numero;



    }

}
