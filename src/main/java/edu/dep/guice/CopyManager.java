package edu.dep.guice;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 * Created by oozie on 06/10/15.
 */
public class CopyManager {
    static boolean copy(String src, String dst) {
        try {
            RecordReaderResolver recordReaderResolver = new RecordReaderResolver(src);
            RecordWriterResolver recordWriterResolver = new RecordWriterResolver(dst);
            DataInputStream dis = recordReaderResolver.read();
            DataOutputStream dio = recordWriterResolver.write();

            int c = -1;
            while ((c = dis.read()) != -1) {
                dio.write((byte) c);
            }
            dis.close();
            dio.close();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}

