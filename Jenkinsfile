node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      echo %GIT_COMMIT% is cloned
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


