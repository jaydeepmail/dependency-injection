package edu.dep.guice;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;
import java.net.URI;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(CopyManager.copy("/Users/oozie/temp", "/Users/oozie/copiedtemp"));
    }
}
