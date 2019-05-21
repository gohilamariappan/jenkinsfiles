#!groovy
def Commit

node('master') {

try {


   stage('Checkout'){
    
       checkout scm
      
  
   }
   
   stage('Checkout'){
    
      withCredentials([string(credentialsId: 'pwd', variable: 'aws_cred')]) {
                      set +x
      sh 'echo $aws_cred'
}
  
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


