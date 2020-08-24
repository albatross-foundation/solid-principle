package com.solid.principle.solution;

public class Copy {
    private IReader iReader;
    private IWriter iWriter;

    public Copy(IReader iReader, IWriter iWriter) {
        this.iReader = iReader;
        this.iWriter = iWriter;
    }

    public void doWork() {
        iWriter.write(iReader.read());
    }
}
