#!groovy
def Commit

node('master') {

try {


   stage('Checkout'){
    
       checkout scm
      sh '''
      comit= $(git rev-list -1 /vars/Jenkinsfile.groovy)
      echo $comit
'''

      
  
   }
   
   stage('Checkout'){
    withCredentials([string(credentialsId: 'pwd', variable: 'PW1')]) {
    echo "My password is '${PW1}'!"
}
  
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


