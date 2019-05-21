#!groovy

node('master') {

try {

   stage('Checkout'){
  
       checkout scm
        sh '''  "git rev-list origin/demo -1 vars/Jenkinsfile.groovy > /home/kubernetes/commit-id".trim()
       commit_id = readFile('/home/kubernetes/commit_id')
'''
      
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


