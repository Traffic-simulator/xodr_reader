package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import java.io.FileReader;
import java.io.IOException;
import opendrive.OpenDRIVE;

public class OpenDriveReader {

    public OpenDRIVE read(String filename) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(OpenDRIVE.class);
        return (OpenDRIVE) context.createUnmarshaller()
                .unmarshal(new FileReader("src/main/resources/" + filename));
    }
}
