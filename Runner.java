package runner;


import Hooks.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="./src/test/java/features",
				 glue={"steps"} ,
				 monochrome = true,
				 publish = true,
				 tags = "not @Smoke and @Regression"
				 )
public class Runner extends BaseClass{

}
