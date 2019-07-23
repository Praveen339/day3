package casestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:cucumber.json"},tags= {"@reg,@login,@cart"})
public class runner {

	

}
