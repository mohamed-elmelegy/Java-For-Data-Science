/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moham
 */
public class PyramidCsvDao implements PyramidDao{

    @Override
    public List<Pyramid> readPyramidsFromCSV(String file_name) throws FileNotFoundException, IOException {
        List<Pyramid> pyramids = new LinkedList<>();
        BufferedReader br;
        br = new BufferedReader(new FileReader(file_name));
        String line = br.readLine();
        while((line = br.readLine()) != null){
            pyramids.add(this.createPyramid(line.split(",")));
        }
        br.close();
        
        return pyramids;
    }

    @Override
    public Pyramid createPyramid(String[] data) {
        
        Pyramid newPyramid = new Pyramid();
        newPyramid.setModern_name(data[2]);
        newPyramid.setSite(data[4]);
        newPyramid.setHeight(data[7]);
        newPyramid.setLat(Float.parseFloat(data[10]));
        newPyramid.setLng(Float.parseFloat(data[11]));
        newPyramid.setMaterial(data[14]);
        
        return newPyramid;
    }
    
}
