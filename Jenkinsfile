node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      echo ${GIT_COMMIT}
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


