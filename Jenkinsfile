#!groovy

node('master') {

try {
   stage('Checkout'){
  
     checkout scm
      sh''' commit_id=$(git log -2 --format=%h)
             echo $commit_id> commit_id.txt
              
              '''
      
      archiveArtifacts 'commit_id.txt'
      		  /*sh''' commit_id=$(git rev-list origin/demo -1 demo | cut -c1-8)
              echo $commit_id
                            ''' */ 
          }
         
  
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
   
 }

}



