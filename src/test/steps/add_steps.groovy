import static cucumber.api.groovy.EN.*
import cucumber.api.PendingException

class Calculator {
def shell = new GroovyShell()
String input
String run(){
	shell.evaluate(input)
}
}

 Given(~/^the input "([^"]*)"$/) { String input ->
	calculator = new Calculator(input: input)
    }

    When(~/^the calculator is run$/) { ->
        // Write code here that turns the p;hrase above into concrete actions
	result = calculator.run()
    }

    Then(~/^the output should be "([^"]*)"$/) { String output ->
        // Write code here that turns the phrase above into concrete actions
	assert result == output
    }
