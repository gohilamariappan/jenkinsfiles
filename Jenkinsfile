#!groovy
def Commit

node('master') {

try {


   stage('Checkout'){
    
       checkout scm
      
  
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


