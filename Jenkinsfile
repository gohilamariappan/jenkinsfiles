#!groovy

node('master') {

try {

   stage('Checkout'){
  
       checkout scm
        trim("git rev-list origin/demo -1 vars/Jenkinsfile.groovy")
         
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


