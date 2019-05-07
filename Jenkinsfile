#!groovy
node('master') {

try {

   stage('Checkout'){
git branch: prod, url: 'https://github.com/gohilamariappan/testproject.git'
   }


}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}

