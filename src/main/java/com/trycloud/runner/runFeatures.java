package com.trycloud.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
        "html:target/cucumber-report",},
        tags = "@tag-1",
        features = "src/recourses",
        glue = "src/tests/java/com/trycloud/stepDefs",
        dryRun = true


)
public class runFeatures {
}
