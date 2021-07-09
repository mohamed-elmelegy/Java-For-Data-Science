package lambdaexpressionandstreamapi;

public class City implements ImplementerType{
    private int id;
    private String name;
    private int population;
    private String countrycode;

    public City(int id, String name, int population, String countrycode) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countrycode = countrycode;
    }

    @Override
    public String toString() {
        return name;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
