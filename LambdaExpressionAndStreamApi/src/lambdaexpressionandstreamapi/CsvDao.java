    package lambdaexpressionandstreamapi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CsvDao {
    String dt="";
    public ImplementerType create(String[] metadata);
    public List<ImplementerType> readFromCsv(String fname) throws FileNotFoundException, IOException;
    
}
