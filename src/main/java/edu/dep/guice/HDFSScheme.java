package edu.dep.guice;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URI;

/**
 * Created by oozie on 06/10/15.
 */
public class HDFSScheme implements Scheme {
    private String path;
    private URI uri;
    private Configuration conf;
    private FileSystem fs;

    HDFSScheme(String path) throws IOException {
        this.path = path;
        uri = URI.create(path);
        conf = new Configuration ();
        fs = FileSystem.get(uri, conf);
    }

    public DataInputStream read() throws IOException {
        FSDataInputStream in = fs.open(new Path(uri));
        return in;
    }

    public DataOutputStream write() throws IOException {
        FSDataOutputStream out = fs.create(new Path(uri));
        return out;
    }
}