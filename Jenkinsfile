node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      sh 'echo "${git.commit.id.abbrev}"'
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


