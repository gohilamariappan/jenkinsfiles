#!groovy
def Commit

node('master') {

try {
   environment {
        AWS_ACCESS_KEY_ID     = credentials('pwd')
            }

   stage('Checkout'){
    
       checkout scm
      
  
   }
   
   stage('Checkout'){
    
      set +x
      sh 'echo $AWS_ACCESS_KEY_ID'
  
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


