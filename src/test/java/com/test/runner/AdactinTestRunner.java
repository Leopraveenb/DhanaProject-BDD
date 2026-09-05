package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Dhanalakshmi\\eclipse-workspace\\MyCucumberAdactin\\src\\test\\resources\\Feature",
                  glue="org.test.stepsdefinition")

public class AdactinTestRunner {

}
