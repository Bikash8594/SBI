package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component

public class JmsConfigRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
System.out.println("jms runner");
	}

	@Override
	public int getOrder() {
		return 13;
	}

}
