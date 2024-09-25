package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import opendrive.OpenDRIVE;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        System.out.println("Hello world!");
        OpenDriveReader odr = new OpenDriveReader();

        OpenDRIVE openDRIVE = odr.read("Town01.xodr");

        System.out.println(openDRIVE.getRoad().size());

        OpenDriveWriter odw = new OpenDriveWriter();
        odw.write(openDRIVE, "Town01_processed.xodr");
    }
}