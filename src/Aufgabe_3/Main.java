package Aufgabe_3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class Main {

    public static void main(String[] args)
    {

        try {
            File file = new File("Aufgabe_2/weather.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Aufgabe_2.Weather.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();


            Aufgabe_2.Weather wetter3 = (Aufgabe_2.Weather) unmarshaller.unmarshal(file);
            System.out.println(wetter3);


            //aufgabe 5 hier, da ich dieselben Klassen verwende und es deshalbe einfacher ist
            Aufgabe_5.Weather wetter4 = new Aufgabe_5.Weather();
            wetter4.setId(wetter3.getId());
            wetter4.setMain(wetter3.getMain());
            wetter4.setDescription(wetter3.getDescription());
            wetter4.setIcon(wetter3.getIcon());
            JasonWriterObjectMapper jom = new JasonWriterObjectMapper();
            jom.writeToJson((Aufgabe_1.Weather) wetter4);





        }
        catch(JAXBException e)
        {
            e.printStackTrace();
        }


    }
}
