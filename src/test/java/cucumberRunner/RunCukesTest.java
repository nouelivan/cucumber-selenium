package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/buttonTest.feature",
glue = "stepDefinitions",
tags = "@test",
plugin = {"html:target/CucumberReport"})
public class RunCukesTest {
}