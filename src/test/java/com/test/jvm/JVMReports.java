package com.test.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
public static void generateJVMReport(String jsonFile) {
	File reportDirectory =new File("C:\\Users\\Dhanalakshmi\\eclipse-workspace\\MyCucumberAdactin\\target\\JVMReport\\JVMExtendedReport.json");
		List jsonFiles=new ArrayList<>();
		jsonFiles.add(jsonFile);
		Configuration configuration=new Configuration(reportDirectory,"AdactinHotelBooking");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("os", "Windows");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Tester", "Dhana");
		ReportBuilder re=new ReportBuilder(jsonFiles,configuration);
		re.generateReports();
		
		
		
}
}
