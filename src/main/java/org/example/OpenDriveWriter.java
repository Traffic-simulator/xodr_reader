package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.FileWriter;
import java.io.IOException;

public class OpenDriveWriter {

    public void write(opendrive.OpenDRIVE opendrive, String filename) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(opendrive.OpenDRIVE.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(opendrive, new FileWriter("src/main/resources/" + filename));
    }
}
