pipeline {
    agent any

    triggers {
        pollSCM '* * * * *' 
    }
    
    stages {
        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Build Docker image') {
            docker.build("imagesIII")
        }
        stage('Deploy') {
            steps {
                echo 'Deploying......'
            }
        }
    }
}
