#!groovy
def Commit

node('master') {

try {

   stage('Checkout'){ 
       def scmVars = checkout scm
        def COMMIT= readFile('scmVars.GIT_COMMIT').trim()
      echo "${COMMIT}"

   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


