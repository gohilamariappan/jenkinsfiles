#!groovy

node('master') {

try {

   stage('Checkout'){
    def commit
       checkout scm
      sh ' commit=$( git rev-list origin/demo -1 vars/Jenkinsfile.groovy ) '
     sh 'echo $commit'

      
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


