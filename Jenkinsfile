node('master') {

try {

   stage('Checkout'){ 
       scmInfo = checkout scm

        /*...*/
        echo "scm : ${scmInfo}"
        echo "${scmInfo.GIT_COMMIT}"
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


