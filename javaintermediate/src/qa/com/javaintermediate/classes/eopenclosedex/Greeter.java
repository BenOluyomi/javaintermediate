package qa.com.javaintermediate.classes.eopenclosedex;

public class Greeter {
	//ATTRIBUTES
	private Greeting greeting;

	//CONSTRUCTOR
    public Greeter(Greeting greeting) {
        this.greeting = greeting;
    }
    //Method
    public String greet() {
        return this.greeting.greet();
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
}