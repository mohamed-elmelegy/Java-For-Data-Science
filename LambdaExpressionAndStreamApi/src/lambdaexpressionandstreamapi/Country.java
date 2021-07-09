package lambdaexpressionandstreamapi;

import java.util.List;

public class Country implements ImplementerType{
    private String code;
    private String name;
    private String continent;
    private double surfAcearea;
    private int population;
    private double gnp;
    private int capital;
    private List<City> myCities;

    
    public Country(String code, String name, String continent, double surfAcearea, int population, double gnp, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfAcearea = surfAcearea;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;
    }
        
    public void setCities(List<City> cities){
        cities.stream().filter(city -> (city.getCountrycode().equals(this.getCountrycode()))).forEachOrdered(city -> {
            this.myCities.add(city);
        });
    }
    
    public List<City> getCities(){
        return this.myCities;
    }
    
    @Override
    public String getCountrycode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfAcearea() {
        return surfAcearea;
    }

    public void setSurfAcearea(double surfAcearea) {
        this.surfAcearea = surfAcearea;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGnp() {
        return gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
    
}
