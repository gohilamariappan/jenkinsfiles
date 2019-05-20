node('master') {

try {

   stage('Checkout'){ 
        scmInfo = checkout scm
      
  /*sh "git rev-parse --short HEAD > .git/commit-id".trim()
       commit_id = readFile('.git/commit-id')*/

    def commit_id = '${scmInfo.GIT_COMMIT}'
      echo "id: ${commit_id}"
    
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


