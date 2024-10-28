package ejercicios_java.serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializable {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        List<Persona> personas = new ArrayList<>();



        // Serializar objeto
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar objeto
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            Persona personaLeida = (Persona) ois.readObject();
            System.out.println(personaLeida);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
