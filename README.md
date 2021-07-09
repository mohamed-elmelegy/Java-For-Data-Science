# Java-For-Data-Science
> This contains my solutions for the practical assignments in "Java For Data Science" course in [ITI-AI 9 Months Professional Training Program](https://ai.iti.gov.eg/epita/ai-engineer/ "Program's Website") Powered By [EPITA](https://www.epita.fr/en/ "EPITA's Website") under supervision of [Egyptian Ministry Of Communication & Information Technology](https://mcit.gov.eg/)
-----------

## Course Objective:
Main objective of this course is to focus on using Java programming language **to emphasize understanding of the principles of object oriented programming**, and **to get quick insights about different prcesses in Data Science projects workflow**. The course inclouded:
- Learning Alot About Different Java Built-In Data Structure
- Functional Programming And Stream APIs
- Different File Format Handling And Data Extraction
- Dataset Preraration And Exploration
- Simple Data Visualization
- Introduction To Data Distributed Processing And Big Data World
- Simple Machine Learning Modeling
- Deployment Of Machine Learning Model On A Web Service
-----------

## Tasks Included:
1) Simple task to read data from console into text file. [Link](https://github.com/mohamed-elmelegy/Java-For-Data-Science/tree/master/ConsoleIntoFile/ "ConsoleIntoFile")
1) Simple task to use **BiPredicate Lambda functions** on Strings. [Link](https://github.com/mohamed-elmelegy/Java-For-Data-Science/tree/master/LambdaBetterString/ "LambdaBetterString")
1) Hands on data extraction from CSV file contains data about [Egyptian Pyramids](https://www.kaggle.com/lsind18/egyptianpyramids), then apply some tasks on Pyramid Objects List like: Sort, Grouping, etc... using **Java Stream** only. [Link](https://github.com/mohamed-elmelegy/Java-For-Data-Science/tree/master/Pyramids/ "Pyramids")
1) Hands on data extraction from 2 CSV files contains data about counries and their cities using **DAO _(Data Access Object)_ Design Pattern**, then exploring this data and get insights using some **Java Stream APIs** and **Lambda functions**. [Link](https://github.com/mohamed-elmelegy/Java-For-Data-Science/tree/master/LambdaExpressionAndStreamApi/ "LambdaExpressionAndStreamApi")
1) Data extraction from JSON file contains data about **Titanic Survivors** using Java Liberary **Jackson**, then visualizing Passenger objects to get more insights with some charts like: **Histogram**, **PieChart** using Java Liberary **XChart**. [Link](https://github.com/mohamed-elmelegy/Java-For-Data-Science/tree/master/TitanicVisualizationUsingXChart/ "TitanicVisualizationUsingXChart")
    - ![Histogram_age](https://github.com/mohamed-elmelegy/Java-For-Data-Science/blob/master/TitanicVisualizationUsingXChart/output_charts/Histogram_age.png?raw=true)
    - ![Histogram_survived_count](https://github.com/mohamed-elmelegy/Java-For-Data-Science/blob/master/TitanicVisualizationUsingXChart/output_charts/Histogram_survived_count.png?raw=true)
    - ![Pie_chart_survived_with_gender](https://github.com/mohamed-elmelegy/Java-For-Data-Science/blob/master/TitanicVisualizationUsingXChart/output_charts/Pie_chart_survived_with_gender.png?raw=true)
    - ![Pie_passenger_class](https://github.com/mohamed-elmelegy/Java-For-Data-Science/blob/master/TitanicVisualizationUsingXChart/output_charts/Pie_passenger_class.png?raw=true)

1) Data extraction from CSV file contains data about **Titanic Survivors**, after that getting some detailed describtion and statistics about data distribution and featured columns using Java Liberaries **Joinery** and **Tablesaw**. [Link](https://github.com/mohamed-elmelegy/Java-For-Data-Science/tree/master/Simple_Titanic_EDA_Using_Joinery_And_Tablesaw/ "Simple_Titanic_EDA_Using_Joinery_And_Tablesaw")
-----------

## Java Liberaries:
- Built-In:
    - Collections
    - Stream
    - File Input/Output Stream
    - FileReader/FileWriter
    - BufferedInputStream/BufferedOutputStream

- Exteranl Dependencies ([Apache Maven](https://maven.apache.org)):
    - [Jackson](https://en.wikipedia.org/wiki/Jackson_(API))
    - [Joinery](https://joinery.sh/v1.10/api/reference/joinery/DataFrame.html)
    - [Tablesaw](https://github.com/jtablesaw/tablesaw)
    - [XChart](https://knowm.org/open-source/xchart)
    - [Smile](https://haifengl.github.io/)
    - [Spark](https://spark.apache.org/):
        - [Spark SQL](https://spark.apache.org/sql/)
        - [Spark Streaming](https://spark.apache.org/streaming/)
        - [Spark MLlib](https://spark.apache.org/mllib/)
