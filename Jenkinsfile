#!groovy

node('master') {

try {

   stage('Checkout'){
  
     def scmVars = checkout scm
      		  sh''' commit_id=$(git rev-list origin/demo -1 vars/Jenkinsfile.groovy | cut -c1-8)
              echo $commit_id
              '''


      //sh'echo $(git rev-list origin/demo -1 vars/Jenkinsfile.groovy | cut -c1-8)'
         
  
   }
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


