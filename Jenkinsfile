#!groovy

node('master') {

try {

   stage('Checkout'){
  
       checkout scm
      sh ' commit=$( git rev-list origin/demo -1 vars/Jenkinsfile.groovy ) '
      echo ${commit}

      
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


