package com.trycloud.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/recourses/TC_features"},
        glue = {"trycloud/testcases", "com/trycloud/testutl"},
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber-reports/Cucumber.json"},
        dryRun = false,
        monochrome = true,
        tags= "@TC1"
)
public class Runner extends AbstractTestNGCucumberTests {

}