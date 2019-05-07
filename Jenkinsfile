#!groovy
node('master') {

try {

   stage('Checkout'){ 
      checkout([
      $class: 'GitSCM', branches: [[name: '*/demo']],
      userRemoteConfigs: [[url: 'https://github.com/gohilamariappan/testproject.git'],[credentialsId:'jenkinsmaster']]
  ])
   }


}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}

