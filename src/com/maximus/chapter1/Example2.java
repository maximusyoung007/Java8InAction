package com.maximus.chapter1;

import java.io.File;
import java.io.FileFilter;

public class Example2 {
    public void example2() {
        File[] hiddenFiles1 = new File("/Users/maximusyoung/").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        for (File f : hiddenFiles1) {
            System.out.println(f.toString());
        }
        System.out.println("java8-----");
        File[] hiddenFiles2 = new File("/Users/maximusyoung/").listFiles(File::isHidden);
        for (File f : hiddenFiles2) {
            System.out.println(f.toString());
        }
    }
}
