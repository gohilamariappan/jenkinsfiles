node('master') {

try {

   stage('Checkout'){ 
        checkout scm
      
  sh "git rev-parse --short HEAD > .git/commit-id".trim()
       commit_id = readFile('.git/commit-id')


        /*
        echo "scm : ${scmInfo}"
        echo "${scmInfo.GIT_COMMIT}" */
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


