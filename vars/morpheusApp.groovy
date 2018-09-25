import org.morpeusclient.JenkinsHttpClient

def buildApp(String morpheusUrl, Map<?, ?> postBody, String bearerToken) {
	JenkinsHttpClient http = new JenkinsHttpClient()
	http.postJson(morpheusUrl, postBody, bearerToken)
}

def pullJson(String morpheusUrl,String bearerToken) {
	JenkinsHttpClient http = new JenkinsHttpClient()
	http.get(morpheusUrl, bearerToken)
}
