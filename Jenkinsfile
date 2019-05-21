#!groovy

node('master') {

try {

   stage('Checkout'){
  
       checkout scm
        sh  "git rev-list origin/demo -1 vars/Jenkinsfile.groovy".trim()
         
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


