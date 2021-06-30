pipeline {
    agent none

    triggers {
        pollSCM '* * * * *' 
    }
    
    stages {
        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t trungnd01/testImages .'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying......'
            }
        }
    }
}
