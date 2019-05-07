#!groovy
node('master') {

try {

   stage('Checkout'){

      checkout scm
   }
stage('compress dist folder')
{
        
  
sh '''

if [-f "sourceCode/Kronos-Admin-Web/dist.zip" ]
then
   cd sourceCode/Kronos-Admin-Web/ && rm -f dist.zip && zip -r dist.zip dist

else
	cd sourceCode/Kronos-Admin-Web/ && zip -r dist.zip dist
fi

'''

        }


}

catch (err) {
    currentBuild.result = "FAILURE"
    throw err
 }

}

