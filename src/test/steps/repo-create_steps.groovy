import static cucumber.api.groovy.EN.*
import cucumber.api.PendingException
import static groovyx.net.http.HttpBuilder.configure
import static groovyx.net.http.util.SslUtils.ignoreSslIssues
import groovy.json.JsonSlurper

class Globals{
        static String username = 'PhilNorman2'
	static String password = ''
	static String creds = "$username:$password".bytes.encodeBase64()
	static github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic creds"
        }
        
}
	
	
    Given(~/^I am an authenticated user$/) { ->
        println 'Given I am an authenticated user'
	globals = new Globals()
        println globals.username
	println globals.github

	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.get {
	//def result = globals.github.get {
	    request.uri.path = '/user'
	    println request.headers
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
             }
        }
	assert globals.github != null
        println globals.github.dump()

    }

    When(~/^I create the "([^"]*)" repository$/) { String arg1 ->
        // Write code here that turns the phrase above into concrete actions
        println 'I create the * repository'
        def input = arg1
	println input 
        println globals.creds

	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.post {
	    request.uri.path = '/user/repos'
            request.contentType = 'application/json'
            //request.body = { name 'monkey' }
            request.body = { name input }
            response.success {fs, Object body ->
                body.name
                }
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
	       throw new RuntimeException()
             }
        }
        println github.dump()

    }

    When(~/^I request a list of my repositories$/) { ->

	println 'When I request a list of my repositories'
	//def globals = new Globals()
	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.get {
	    request.uri.path = '/user/repos'
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
             }
        }
	assert github != null
        println github.dump()

    }

    Then(~/^The results should include a repository name "([^"]*)"$/) { String arg1 ->
        println 'the results should include a repository name *'
	def input = arg1

	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.get {
	    request.uri.path = '/user/repos'
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
            }
        }
        println "loop through repo names"
	boolean worked = false 
        github.name.each {
           println it
           if (it == input) {
	      worked = true
              }
        }
        println ("worked: " + worked)
        if (worked == false) {
           println "about to throw exception"
	   throw new RuntimeException()
           }
   }

 Given(~/^I have a repository called "([^"]*)"$/) { String arg1 ->
        // Write code here that turns the phrase above into concrete actions
        // This is a duplicate of the last step, so pass it.
    }

    When(~/^I watch the "([^"]*)" repository$/) { String arg1 ->
        println 'when I watch the * repository'
        // Write code here that turns the phrase above into concrete actions
        def input = arg1
	println input 
        def path = '/' + 'repos' + '/' + globals.username + '/' + input + '/' +'subscription'
        println 'https://api.github.com' + path 

	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.put {
	    request.uri.path = path
            request.contentType = 'application/json'
            request.body = { subscribed 'true' }
            response.success {fs, Object body ->
                body.name
                }
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
	       throw new RuntimeException()
             }
        }
        //assert (github != null)
        //println github.dump()
    }

    Then(~/^The "([^"]*)" repository will list me as a watcher$/) { String arg1 ->
        // Write code here that turns the phrase above into concrete actions
        println 'The * repositiory will list me as a watcher'
	def input = arg1
	def path = '/users' + '/' + globals.username + '/' + 'subscriptions' 

	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.get {
	    request.uri.path = path
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
            }
        }
        println "find match on input and subscription"
	boolean worked = false 
        println github.name
        github.name.each {
           println it
           if (it == input) {
	      worked = true
              }
        }
        println ("worked: " + worked)
        if (worked == false) {
           println "about to throw exception"
	   throw new RuntimeException()
           }
    }

    Then(~/^I delete the repository called "([^"]*)"$/) { String arg1 ->
        // Write code here that turns the phrase above into concrete actions
        println 'then I delete the repository called *'
	def input = arg1
	println input 
        def path = '/' + 'repos' + '/' + globals.username + '/' + input 
        println 'https://api.github.com' + path 

	def github = configure {
    	    ignoreSslIssues execution
    	    request.uri = 'https://api.github.com'
            request.headers['Authorization'] = "Basic $globals.creds"
        }.delete {
	    request.uri.path = path
            request.contentType = 'application/json'
	    response.failure { fs, obj->
            println "Status: ${fs.statusCode}"
            fs.headers.each { h->
               println h
               }
	       throw new RuntimeException()
             }
        }

    }

