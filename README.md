# Java Project
- Git Clone :https://github.com/CTNH41/Qardio.git
- CircleCI was used to CI/CD part


## Java Project Test Vocabulary
- Implement a search algorithm for the provided set of data under the DataReader class.
- Add JUnit Test cases  and cover positive and negative test scenarios
- Add CI/CD support to trigger build after each commit in GitHub

## Added needed dependencies
```bash
 <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
    <dependency>
      <groupId>com.googlecode.json-simple</groupId>
      <artifactId>json-simple</artifactId>
      <version>1.1.1</version>
    </dependency>
    
```
## Extending the vocabulary
- data.json file , CityReader Class , CitiesSearchTest class are already exist
- CityReader Class contains some methods which is used to cover possible scenarios
- CitiesSearchTest class contain test methods for negative and positive scenarios

## Examples
- Example Qardio JUnit Test cases for Positive Scenarios
```bash
 @Test
    public void checkData() throws IOException, ParseException {

        List l = CityReader.searchData("Amsterdam");

        String expected="Amsterdam";
        String actual=l.get(0).toString();
        Assert.assertEquals(expected,actual);
    }






```

- Example Qardio JUnit Test cases for Negative Scenarios
```bash

    // check invalid data in cityName and cityDescription
    @Test
    public void invalidData() throws IOException, ParseException {

        List l = CityReader.searchData("Helsinki");
        Assert.assertEquals("Helsinki",l.get(0));
    }



    
    
```

##Help
In case you have a question contact ( halit.chetin@gmail.com )
