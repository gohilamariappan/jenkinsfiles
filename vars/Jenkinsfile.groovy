def call(body) {
body()
node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      sh 'echo helo'
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


}
