#!groovy
node('master') {

try {

   stage('Checkout'){ 
      checkout([
      $class: 'GitSCM', branches: [[name: '*/prod']],
      userRemoteConfigs: [[url: 'https://github.com/gohilamariappan/testproject.git'],[credentialsId:'a2d569d1-12c5-404d-a532-f5c0b5ad006c']]
  ])
   }


}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}

