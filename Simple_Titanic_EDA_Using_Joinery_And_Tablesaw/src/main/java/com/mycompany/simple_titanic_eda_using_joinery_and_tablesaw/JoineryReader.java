package com.mycompany.simple_titanic_eda_using_joinery_and_tablesaw;

import java.io.IOException;
import joinery.DataFrame;

public class JoineryReader {
    private String fileName;

    public JoineryReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    DataFrame<Object> read() throws IOException {
        DataFrame<Object> df = DataFrame.readCsv(this.fileName)
                .retain("name", "sex", "age", "pclass", "fare", "survived");

        return df;
    }
    
    void summary(DataFrame df) {
        System.out.println("\n============== Data Types Of Columns ==============\n" + df.types());
        System.out.println("\n============== Numeric Columns ==============\n" + df.numeric().head(5));
        System.out.println("\n============== Non-Numeric Columns ==============\n" + df.nonnumeric().head(5));
        System.out.println("\n============== First 5 Rows ==============\n" + df.head(5));
        System.out.println("\n============== Last 5 Rows ==============\n" + df.tail(5));
        System.out.println("\n============== Count Of Columns Data ==============\n" + df.count());
        System.out.println("\n============== Average For All Numeric Coulmns ==============\n" + df.mean());
        System.out.println("\n============== Median For All Numeric Coulmns ==============\n" + df.median());
        System.out.println("\n============== Lower Quartile For All Numeric Coulmns ==============\n" + df.percentile(0.25));
        System.out.println("\n============== Upper Quartile For All Numeric Coulmns ==============\n" + df.percentile(0.75));
        System.out.println("\n============== Max Value For All Numeric Coulmns ==============\n" + df.max());
        System.out.println("\n============== Min Value For All Numeric Coulmns ==============\n" + df.min());
        System.out.println("\n============== Summarized Describtion For All Numeric Coulmns ==============\n" + df.describe());
    }
}
