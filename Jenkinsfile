pipeline {
    agent any

    triggers {
        pollSCM '* * * * *' 
    }
    
    stages {
        stage('Build') {
            steps {
                withMaven(maven: 'mvn') {
                    sh "mvn clean package"
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
