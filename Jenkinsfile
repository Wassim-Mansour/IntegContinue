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
            currentBuild.result = 'FAILED'   
            emailext body: 'build failure', subject: 'buildJenkinsStatus', to: 'wassim.mansour@esprit.tn'
            }
            finally { }
}
}
}
 
stage("send mail") {
steps {
script {
// If build terminate notif user

emailext body: 'build return to normale', subject: 'buildJenkinsStatus', to: 'wassim.mansour@esprit.tn'
}
}
}

	 post {
always {
emailext body: 'salut', subject: 'post', to: 'wassim.mansour@esprit.tn'
}
}

}
}
