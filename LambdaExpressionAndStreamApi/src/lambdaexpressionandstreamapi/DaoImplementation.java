/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressionandstreamapi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 20111
 */
public class DaoImplementation implements CsvDao{
    public String dt;
    public DaoImplementation(String dt) {
        this.dt = dt;
    }
    
    
    
    @Override
    public ImplementerType create(String[] metadata) {
        if("city".equals(this.dt.toLowerCase())) {
            return new City(Integer.valueOf(metadata[0]), metadata[1], Integer.valueOf(metadata[2]),  metadata[3]);
        } else{
            return new Country( metadata[0],metadata[1],metadata[2], Double.valueOf(metadata[3]),  Integer.valueOf(metadata[4]),Double.valueOf(metadata[5]),Integer.valueOf(metadata[6]));
        }
    }

    @Override
    public List<ImplementerType> readFromCsv(String fname) throws FileNotFoundException, IOException {
        List<ImplementerType> result = new LinkedList<ImplementerType>();
        
        BufferedReader br;
        br = new BufferedReader(new FileReader(fname));

        String line = br.readLine();

        do {
            line = br.readLine();
            if (line != null) {
                String[] p = line.split(",");
                result.add(create(p));
            }

        } while (line != null);
        return result;
    }
}
