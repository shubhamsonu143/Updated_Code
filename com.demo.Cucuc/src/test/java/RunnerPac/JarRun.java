package RunnerPac;

import cucumber.api.cli.Main;

public class JarRun {

	public static void main(String[] args) {
		 Main.main(new String[]{"-g", "com.demo.Cucuc",
				 "src\\test\\resources"});

	}

}
