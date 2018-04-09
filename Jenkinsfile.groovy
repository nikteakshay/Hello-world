pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                script {
                def response = httpRequest 'http://httpbin.org/response-headers?param1=Anil'
                println('Status: '+response.status)
                println('Response: '+response.content)
                }
            }
        }
    }
}