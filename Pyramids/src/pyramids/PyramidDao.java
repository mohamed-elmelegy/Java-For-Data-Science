/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.IOException;
import java.util.List;


public interface PyramidDao {
    public List<Pyramid> readPyramidsFromCSV(String file_name) throws IOException;
    public Pyramid createPyramid(String [] data);
}
