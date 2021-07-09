/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressionandstreamapi;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
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
        /**
         * ********* Reading & Loading `city.csv` & `country.csv` Files Into
         * List Of Objects ***********
         */
        DaoImplementation CsvDao = new DaoImplementation("city");
        List<ImplementerType> cities = CsvDao.readFromCsv("city.csv");
        DaoImplementation CsvDao2 = new DaoImplementation("country");
        List<ImplementerType> countries = CsvDao2.readFromCsv("country.csv");

        /**
         * **************************** Grouping Cities By Country Code ******************************
         */
        Map<String, List<ImplementerType>> countryMap = cities
                .stream()
                .collect(Collectors.groupingBy(ImplementerType::getCountrycode));
        countryMap.forEach((k, v) -> System.out.println(k + " = " + v));

        /**
         * ********** Getting City Population Of Specific Country Code Entered
         * In Console ***********
         */
        System.out.print("==================\nPlease Enter Country Code: ");
        Scanner sc = new Scanner(System.in);
        String counrty_code = sc.nextLine();
        cities
                .stream()
                .map(c -> (City) c)
                .filter((c) -> counrty_code.equals(c.getCountrycode()))
                .sorted((c1, c2) -> Integer.compare(c2.getPopulation(), c1.getPopulation()))
                .collect(Collectors.toList())
                .forEach((c) -> System.out.println(c.getName() + " => " + c.getPopulation()));
        System.out.print("=======================================\n");

        /************** Listing & Getting Average and Maximum Population Of Countries ****************/
        Map<String, Integer> countryPopulation = new HashMap<>();
        countries
                .stream()
                .forEach(country -> countryPopulation.put(country.getName(), country.getPopulation()));
        
        Map<String, Integer> DescSortedCountryPopulation = countryPopulation
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        Double avg = DescSortedCountryPopulation.values().stream().collect(Collectors.averagingInt((t) -> t));
        Optional<Integer> max = DescSortedCountryPopulation.values().stream().max(Comparator.comparing((t) -> t));
        List<Optional<ImplementerType>> highestPopulationCities = new LinkedList<>();
        countryMap
            .values()
            .stream()
            .forEach((imp) -> {
                highestPopulationCities.add(
                    imp
                        .stream()
                        .max(Comparator.comparing(ImplementerType::getPopulation))
                );
            });
        
        System.out.println("Listing of Countries Population: " + DescSortedCountryPopulation);
        System.out.println("Average of Countries Population ~ " + avg.intValue());
        System.out.println("Maximum of Countries Population: " + max.get());
        System.out.println("Highest Population Cities: " + highestPopulationCities
                .stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .sorted((c1, c2) -> Integer.compare(c2.getPopulation(), c1.getPopulation()))
                .collect(Collectors.toList())
        );
        
        
        System.out.print("=======================================\n");
        
        List<Integer> capitals = new LinkedList<>();
        countries
                .stream()
                .map(c -> (Country) c)
                .forEach(c -> capitals.add(c.getCapital()));
        
        List<City> capitalCities = new LinkedList<>();
        highestPopulationCities
                .stream()
                .map(Optional::get)
                .map(c -> (City) c)
                .forEach((c) -> {
                    if(capitals.contains(c.getId()))
                        capitalCities.add(c);
                });
        
        City maxCapital = capitalCities
                .stream()
                .max(Comparator.comparing(c -> c.getPopulation()))
                .get();
        
        System.out.println("Highest Capital Population: " + maxCapital);
        
    }

}
