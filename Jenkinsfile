pipeline {
    agent any

    def mvnHome = tool 'maven'
    triggers {
        pollSCM '* * * * *' 
    }
    
    stages {
        stage('Build') {
            steps {
                sh "'${mvnHome}/bin/mvn' clean install"
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
