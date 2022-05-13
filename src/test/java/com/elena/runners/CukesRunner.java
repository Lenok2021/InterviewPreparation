package com.elena.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"

            },
            features = "src/test/resources/features",
            glue = "src/test/java/com/elena/stepDefs",
            dryRun = false,
            tags = "",
            publish = true

    )
    public class CukesRunner {



    }









