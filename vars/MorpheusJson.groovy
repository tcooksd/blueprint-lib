#!/usr/bin/groovy


/* def buildApp(String morpheusUrl, Map<?, ?> postBody, String bearerToken) {
	JenkinsHttpClient http = new JenkinsHttpClient()
	http.postJson(morpheusUrl, postBody, bearerToken)
}

def pullJson(String morpheusUrl,String bearerToken) {
	JenkinsHttpClient http = new JenkinsHttpClient()
	http.get(morpheusUrl, bearerToken)
}
*/

/* def buildBlueprintJson(Map<?, ?>) {} */

class buildAppJson {

	postBodyTest = "testasdf"

}

def test1 = new buildAppJson()
println test1.postBodyTest
/* def buildTaskJson(Map<?, ?>) {}

def buildWorkflowJson(Map<?, ?>) {}
*/
