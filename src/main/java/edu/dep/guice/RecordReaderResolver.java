package edu.dep.guice;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by oozie on 06/10/15.
 */
public class RecordReaderResolver {
    private Scheme scheme;
    RecordReaderResolver (String path) throws IOException {
        if (path.startsWith("hdfs://")) {
            scheme = new HDFSScheme(path);
        } else {
            scheme = new LocalFSScheme(path);
        }
    }

    DataInputStream read() throws IOException {
        return scheme.read();
    }
}
