pipeline {
agent {
label "master"
}
tools {
// Note: this should match with the tool name configured in your jenkins instance (JENKINS_URL/configureTools/)
maven 'Maven3'
}

environment {
// This can be nexus3 or nexus2
NEXUS_VERSION = "nexus"
// This can be http or https
NEXUS_PROTOCOL = "http"
// Where your Nexus is running
NEXUS_URL = "localhost:8081"
// Repository where we will upload the artifact
NEXUS_REPOSITORY = "maven-snapshots"
// Jenkins credential id to authenticate to Nexus OSS
NEXUS_CREDENTIAL_ID = "nexus-cred"
}


stages {
stage("clone code") {
steps {
script {
// Let's clone the source
echo 'Clone From Git Started'
git credentialsId: '26a8dbf4-0cc8-4741-9de8-f27c81b85946', url: 'https://github.com/Wassim-Mansour/IntegContinue.git';
echo 'Clone  Done'
}
}
}
       
stage("mvn build") {
steps {
script {
// If you are using Windows then you should use "bat" step
// Since unit testing is out of the scope we skip them
try{
echo 'Maven Build Started'
bat "mvn clean install -DskipTests=true"
echo 'Maven Build Success'
} catch (err) {
emailext body: 'build failure', subject: 'buildMavenStatus', to: 'wassim.mansour@esprit.tn'
echo 'Maven Build Failure'
}
finally { 
echo 'Maven Build Finished'
}
}
}
}

	
stage("publish to nexus") {
steps {
script {
echo 'publish to nexus..'
// Read POM xml file using 'readMavenPom' step , this step 'readMavenPom' is included in: https://plugins.jenkins.io/pipeline-utility-steps
pom = readMavenPom file: "pom.xml";
// Find built artifact under target folder
filesByGlob = findFiles(glob: "target/*.${pom.packaging}");
// Print some info from the artifact found
echo "${filesByGlob[0].name} ${filesByGlob[0].path} ${filesByGlob[0].directory} ${filesByGlob[0].length} ${filesByGlob[0].lastModified}"
// Extract the path from the File found
artifactPath = filesByGlob[0].path;
// Assign to a boolean response verifying If the artifact name exists
artifactExists = fileExists artifactPath;
if(artifactExists) {
echo "*** File: ${artifactPath}, group: ${pom.groupId}, packaging: ${pom.packaging}, version ${pom.version}";
nexusArtifactUploader(
nexusVersion: NEXUS_VERSION,
protocol: NEXUS_PROTOCOL,
nexusUrl: NEXUS_URL,
groupId: pom.groupId,
version: pom.version,
repository: NEXUS_REPOSITORY,
credentialsId: NEXUS_CREDENTIAL_ID,
artifacts: [
// Artifact generated such as .jar, .ear and .war files.
[artifactId: pom.artifactId,
classifier: '',
file: artifactPath,
type: pom.packaging],
// Lets upload the pom.xml file for additional information for Transitive dependencies
[artifactId: pom.artifactId,
classifier: '',
file: "pom.xml",
type: "pom"]
]
);
} else {
error "*** File: ${artifactPath}, could not be found";
}
}
}
}

	

}
	post {
 always {
            echo 'One way or another, I have finished'
	    echo 'Notif Par Mail Sended'
             /* deleteDir() clean up our workspace */
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
