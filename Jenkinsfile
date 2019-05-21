#!groovy

node('master') {

try {

   stage('Checkout'){
    
       checkout scm
      sh 'comit= $( git rev-list origin/demo -1 vars/Jenkinsfile.groovy ) '

           sh 'echo $comit'
 
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


