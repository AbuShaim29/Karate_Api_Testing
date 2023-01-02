package api;

import com.intuit.karate.junit5.Karate;

public class ApiTestRunner {

	@Karate.Test
	Karate test() {
		return Karate.run("getApi").tags("tag2").relativeTo(getClass());
	}
	
}
