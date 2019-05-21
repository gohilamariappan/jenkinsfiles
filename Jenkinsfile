#!groovy
def Commit

node('master') {

try {

   stage('Checkout'){
    
       checkout scm
      
  
   }
   
   stage('Checkout'){
    
      set +x
      sh 'echo $pwd'
  
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


