pipeline {
    agent any
  stages{
	  stage ('Build') {
     steps {
                bat 'mvn install' 
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
