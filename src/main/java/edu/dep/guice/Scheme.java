package edu.dep.guice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by oozie on 06/10/15.
 */
public interface Scheme {
    DataInputStream read() throws IOException;
    DataOutputStream write() throws IOException;
}
