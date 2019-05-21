#!groovy
def Commit

node('master') {

try {


   stage('Checkout'){
    
       checkout scm
      
  
   }
   
   stage('Checkout'){
    
      set +x
      withCredentials([string(credentialsId: 'pwd', variable: 'aws_cred')]) {
      sh 'echo $aws_cred'
}
  
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


