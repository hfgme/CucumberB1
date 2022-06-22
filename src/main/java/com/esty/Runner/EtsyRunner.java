package com.esty.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class) //Karate.class
    @CucumberOptions(
            features = "src/main/resources/features/etsy",
            glue = "com/etsy/stepdefinitions",
            dryRun = true,
            tags ="@etsy",
            plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
    )
    public class EtsyRunner {

}
