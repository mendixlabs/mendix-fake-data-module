[![Support](https://img.shields.io/badge/Support-Community%20(no%20active%20support)-orange.svg)](https://docs.mendix.com/developerportal/app-store/app-store-content-support)
[![Studio](https://img.shields.io/badge/Studio%20version-9.0%2B-blue.svg)](https://appstore.home.mendix.com/link/modeler/)
![GitHub release](https://img.shields.io/github/release/JelteMX/mendix-fake-data-module)
![GitHub issues](https://img.shields.io/github/issues/JelteMX/mendix-fake-data-module)

# Fake Data Module for Mendix

![Icon](/assets/FakeDataIcon.png)

Want to generate fake data in Mendix? The Fake Data Module for Mendix does this for you. It uses the popular [Faker](https://github.com/DiUS/java-faker) library.

![screenshot](/assets/FakeDataScreenshot1.png)

## Java Actions

### Dates

- **GenerateDateBetween** - generate a date between two dates

### Numbers

- **GenerateDecimalBetween** - generate a decimal between two numbers
- **GenerateNumberBetween** - generate an integer/long between two numbers
- **GenerateNumberDigits** - generate an long number with an X amount of digits

### Objects

The following Entities can be created:

 - App
 - Artist
 - Cat
 - Commerce
 - Name

Please have a look at the Domain Model in the module for all attributes that are set.

### Strings

- **GenerateFakeString** - generate a string from a predefined list of types, like hashes, quotes
- **GenerateQuote** - generate a string that holds a quote from one of the predefined movies/characters
- **GenerateRandomColorHex** - generate a color in HEX format
- **GenerateRandomRegexString** - generate a string based on a Regex. More information can be found here: [https://github.com/mifmif/Generex](https://github.com/mifmif/Generex)
- **GenerateRandomString** - generate a string based on a mask. This mask will replace any `?` with a letter and any `#` with a number.

## Libraries used

- Apache Commons Lang
    - Version 3.7
    - License: Apache 2.0
    - [link](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.7)
- SnakeYAML
    - Version 1.30
    - License: Apache 2.0
    - [link](https://mvnrepository.com/artifact/org.yaml/snakeyaml/1.30)
- JavaFaker
    - Version 1.0.2
    - License: Apache 2.0
    - [link](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2)

## Adding new Java Actions

You can create new Java Actions using the Faker library. See [API docs](http://dius.github.io/java-faker/apidocs/index.html).

## License

Apache 2
