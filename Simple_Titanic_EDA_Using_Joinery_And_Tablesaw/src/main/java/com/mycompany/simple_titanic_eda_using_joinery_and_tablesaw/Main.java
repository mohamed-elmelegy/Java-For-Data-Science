package com.mycompany.simple_titanic_eda_using_joinery_and_tablesaw;

import java.io.IOException;
import joinery.DataFrame;
import tech.tablesaw.api.Table;

public class Main {

    public static void main(String args[]) throws IOException {
        System.out.println("################################## Joinery #######################################");
        JoineryReader jReader = new JoineryReader("titanic.csv");
        DataFrame<Object> df = jReader.read();
        jReader.summary(df);

        /*=========================================================================*/
        System.out.println("\n\n################################## Tablesaw #######################################");
        
        TablesawReader tableReader = new TablesawReader("titanic.csv");
        Table table = tableReader.read();
        tableReader.summary(table);

    }
}
