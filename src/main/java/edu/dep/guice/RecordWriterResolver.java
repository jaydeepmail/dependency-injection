package edu.dep.guice;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by oozie on 06/10/15.
 */
public class RecordWriterResolver {
    Scheme scheme;
    RecordWriterResolver (String path) throws IOException {
        if (path.startsWith("hdfs://")) {
            scheme = new HDFSScheme(path);
        } else {
            scheme = new LocalFSScheme(path);
        }
    }

    DataOutputStream write() throws IOException {
        return scheme.write();
    }
}
