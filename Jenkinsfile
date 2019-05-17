node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      sh'echo %GIT_COMMIT% is cloned'
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


