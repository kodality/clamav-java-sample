package com.kodality;

import fi.solita.clamav.ClamAVClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException {
        File virus = new File(App.class.getClassLoader().getResource("a-la-virus").getFile());

        ClamAVClient client = new ClamAVClient("localhost", 3310);
        try (FileInputStream is = new FileInputStream(virus)) {
            byte[] resp = client.scan(is);
            boolean noViruses = ClamAVClient.isCleanReply(resp);
            System.out.println("File has no viruses: " + noViruses);
        }
    }
}
