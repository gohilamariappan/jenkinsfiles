#!groovy
def Commit

node('master') {

try {

   stage('Checkout'){ 
       def scmVars = checkout scm
        echo "scmVars.GIT_COMMIT: ${scmVars.GIT_COMMIT}"

   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


