package edu.dep.guice;

import java.io.*;

/**
 * Created by oozie on 06/10/15.
 */
public class LocalFSScheme implements Scheme {
    private String pathStr;
    LocalFSScheme(String path) {
        pathStr = path;
    }

    @Override
    public DataInputStream read() throws IOException {
        FileInputStream fin = new FileInputStream(pathStr);
        DataInputStream din = new DataInputStream(fin);
        return din;
    }

    @Override
    public DataOutputStream write() throws IOException {
        FileOutputStream fos = new FileOutputStream(pathStr);
        DataOutputStream dos = new DataOutputStream(fos);
        return dos;
    }
}