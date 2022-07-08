pipeline {
    agent any
  stages{
     steps {
                sh 'mvn install' 
            }
  }
  
  post {
always {
	echo "pipeline finished"
	//bat ./performCleanUp.bat
}
}
  
}
