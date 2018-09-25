import org.blueprint01.Application01

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

def buildAppJson(String postbody01) {
	Application01 jsonret01 = new Application01()
	jsonret01.postBody01(postbody01)

}


/* def buildTaskJson(Map<?, ?>) {}

def buildWorkflowJson(Map<?, ?>) {}
*/
