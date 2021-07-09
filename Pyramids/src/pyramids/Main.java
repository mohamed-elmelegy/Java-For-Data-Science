/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author moham
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        PyramidCsvDao pyramidCsvReader = new PyramidCsvDao();
        List<Pyramid> pyramids = pyramidCsvReader.readPyramidsFromCSV("pyramids.csv");
        pyramids.forEach(p -> {
            System.out.println(p);
        });
        
        /*______________________________________________________________*/
        
        System.out.println("=============================\n" + "Sorted By Height: \n=================");
        pyramids.sort((p1, p2) -> {
            if (p1.getHeight() < p2.getHeight())
                return 1;
            else
                return -1;
            }
        );
        pyramids.forEach(p -> {
            System.out.println(p);
        });
        
        /*______________________________________________________________*/
        
        System.out.println("=============================\n" + "Map Each Site With Its Pyramids Count: \n===========================");
        
        Map<String, Long> sitesMap = (Map<String, Long>) pyramids
                .stream()
                .collect(Collectors.groupingBy(p -> p.getSite(), Collectors.counting()));
        
        sitesMap.forEach(
            (key, value) -> System.out.println(key + " includes => " + value + " sites")
        );
        
    }
    
}
