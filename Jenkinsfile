#!groovy
def Commit

node('master') {

try {

   stage('Checkout'){ 
       def scmVars = checkout scm
        def COMMIT= trim(scmVars.GIT_COMMIT)
      echo "${COMMIT}"

   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


