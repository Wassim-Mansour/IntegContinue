pipeline {
agent {
label "master"
}
tools {
// Note: this should match with the tool name configured in your jenkins instance (JENKINS_URL/configureTools/)
maven 'Maven3'
}
stages {
stage("clone code") {
steps {
script {
// Let's clone the source
git 'https://github.com/Wassim-Mansour/IntegContinue.git';
}
}
}
       
stage("mvn build") {
steps {
script {
// If you are using Windows then you should use "bat" step
// Since unit testing is out of the scope we skip them
try{
bat "mvn clean install -DskipTests=true"
} catch (err) {
emailext body: 'build failure', subject: 'buildMavenStatus', to: 'wassim.mansour@esprit.tn'
}
finally { 
echo 'Build Maven finished'
}
}
}
}

	

}
	post {
 always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
        success {
            echo 'I succeeeded!'
			emailext body: 'build success', subject: 'buildJenkinsStatus', to: 'wassim.mansour@esprit.tn'

        }
        unstable {
            echo 'I am unstable :/'
			emailext body: 'build unstable', subject: 'buildJenkinsStatus', to: 'wassim.mansour@esprit.tn'
        }
        failure {
            echo 'I failed :('
			emailext body: 'build failure', subject: 'buildJenkinsStatus', to: 'wassim.mansour@esprit.tn'
        }
        changed {
            echo 'Things were different before...'
			emailext body: 'build changed', subject: 'buildJenkinsStatus', to: 'wassim.mansour@esprit.tn'

        }
}
	
}
