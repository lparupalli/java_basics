package com.lalitha.checkedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ClassA {

    void methodA()throws FileNotFoundException, SQLException, IOException{
        this.methodB();
        throw new IOException("LALITHA");
    }
    void methodB()throws SQLException, IOException{
        this.methodC();
        throw new SQLException("SQL Exception");
    }

    void methodC() throws IOException {

    }
}
