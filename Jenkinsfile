#!groovy
def Commit

node('master') {

try {

   stage('Checkout'){ 
        scmInfo = checkout scm
      sh '''Commit=$(echo ${scmInfo.GIT_COMMIT})
        echo $Commit'''
      
  /*

    def commit_id = '${scmInfo.GIT_COMMIT}'
      echo "id: ${commit_id}" */
    
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


