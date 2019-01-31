package Aufgabe_2;

import Aufgabe_1.ObjectMapperWeather;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  throws IOException, JAXBException, FileNotFoundException {
        ObjectMapperWeather omw = new ObjectMapperWeather();

        Aufgabe_1.Weather wetter1 = omw.readJson();

        Weather wetter2 = new Weather(wetter1.getId(), wetter1.getMain(), wetter1.getDescription(), wetter1.getIcon());


        JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);

        Marshaller marshaller = jaxbContext.createMarshaller();


        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(wetter2, new File("aufgabe_2/weather.xml"));
        marshaller.marshal(wetter2, System.out);
    }
}