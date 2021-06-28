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
            def img = docker.build('jenkins-docker-maven-example:latest', '.')
        }
        stage('Deploy') {
            steps {
                echo 'Deploying......'
            }
        }
    }
}
