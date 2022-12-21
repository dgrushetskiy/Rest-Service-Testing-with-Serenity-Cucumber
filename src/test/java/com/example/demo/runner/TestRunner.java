package com.example.demo.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin ="pretty",features= {"src/test/resources/features/APITest.feature"}, glue= {"com.example.demo.stepdefinitions"})
public class TestRunner {

}