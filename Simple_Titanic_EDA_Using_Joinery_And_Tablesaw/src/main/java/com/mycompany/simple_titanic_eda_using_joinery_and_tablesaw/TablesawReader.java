package com.mycompany.simple_titanic_eda_using_joinery_and_tablesaw;

import java.io.IOException;
import java.util.Arrays;
import tech.tablesaw.api.Table;

public class TablesawReader {

    private String fileName;

    public TablesawReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Table read() throws IOException {
        Table data = Table.read().csv(this.fileName);
        return data;
    }
    
    public void summary(Table data) {
        System.out.println("\n============== Coulmns Types ==============\n" + Arrays.toString(data.columnTypes()));
        System.out.println("\n============== Numeric Coulmns ==============\n" + data.numericColumns());
        System.out.println("\n============== Data Shape ==============\n" + data.shape());
        System.out.println("\n============== Rows Count ==============\n" + data.rowCount());
        System.out.println("\n============== Missing Value Count ==============\n" + data.missingValueCounts());
        System.out.println("\n============== First 5 Rows ==============\n" + data.first(5));
        System.out.println("\n============== Last 5 Rows ==============\n" + data.last(5));
        System.out.println("\n============== Data Structures ==============\n" + data.structure());
        System.out.println("\n============== Data Summary ==============\n" + data.summary());
    }
}
