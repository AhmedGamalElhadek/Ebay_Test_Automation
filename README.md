# eBay Test Automation Framework

This repository contains a test automation framework developed using Selenium WebDriver, Java, and TestNG. The framework is designed to automate user flows on the eBay website.

## Features

- Utilizes Page Object Model (POM) design pattern for improved maintainability and reusability.
- Supports data-driven testing by reading test data from an external JSON file.
- Provides test cases to:
  - Navigate to eBay's main page.
  - Validate landing on the main page.
  - Search for "mazda mx-5".
  - Validate search results.
  - Apply the "Manual" transmission filter from the left-hand side.
- Generates meaningful execution reports using TestNG.

## Getting Started

1. Clone this repository to your local machine.
2. Set up the required dependencies:
   - Java
   - Selenium WebDriver
   - TestNG
   - ChromeDriver (for running tests in Google Chrome)
3. Update the test data in the `src/main/resources/testdata.json` file.
4. Configure any necessary paths and settings in the framework.
5. Run the tests using the `SearchTest` class.

## Project Structure

- `src/test/java/search/SearchTest.java`: Contains the TestNG test methods for the user flows.
- `src/main/java/base/BaseTest.java`: Includes common setup and teardown methods.
- `src/main/java/pages/MainPage.java`: Page Object class for the main eBay page.
- `src/main/java/pages/SearchResultPage.java`: Page Object class for the search results page.
- `src/main/resources/testdata.json`: JSON file containing the test data.

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/AhmedGamalElhadek/Ebay_Test_Automation.git
