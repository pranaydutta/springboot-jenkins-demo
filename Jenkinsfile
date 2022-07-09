pipeline {
    agent any
  stages{
	  stage ('Build') {
     steps {
                sh 'mvn install' 
            }
	  }
  }
  
  post {
always {
	echo "pipeline finished"
	//bat ./performCleanUp.bat
}
}
  
}
