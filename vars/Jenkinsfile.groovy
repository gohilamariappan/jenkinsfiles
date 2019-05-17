def call(body) {
   
body()
node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      sh 'echo $test'
      sh 'echo $deploy'
      
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


}
