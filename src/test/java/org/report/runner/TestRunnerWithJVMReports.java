package org.report.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.test.jvm.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Dhanalakshmi\\eclipse-workspace\\MyCucumberAdactin\\src\\test\\resources\\Feature",
                  glue="org.test.stepsdefinition",
                  plugin= {"pretty","json:C:\\Users\\Dhanalakshmi\\eclipse-workspace\\MyCucumberAdactin\\target\\Export.json",
                             "html:C:\\Users\\Dhanalakshmi\\eclipse-workspace\\MyCucumberAdactin\\target\\ExportReport.html"})
public class TestRunnerWithJVMReports extends JVMReports{
	@AfterClass
	public static void ReportGenerationAfterExecution() {
		JVMReports.generateJVMReport("C://Users//Dhanalakshmi//eclipse-workspace//MyCucumberAdactin//target//Export.json");	
	}
	

}
