package camel.experiment.route;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {
	public void configure() {
		from("file://data/person-samples?noop=true")
		.choice()
		.when(xpath("/person/city = 'London'"))
			.to("file://target/messages/uk")
		.otherwise()
			.to("file://target/messages/others");
	}
}
