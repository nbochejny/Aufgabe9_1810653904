package Aufgabe_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            //neues Objekt objektmapper und ausführen der readJson methode
            ObjectMapperWeather omw = new ObjectMapperWeather();
            System.out.println(omw.readJson());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
