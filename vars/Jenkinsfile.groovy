def call(body) {
   def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
body()
node('master') {

try {

   stage('Checkout'){ 
      checkout scm
      sh "echo '${config.first}'"
      
   }
}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}


}
