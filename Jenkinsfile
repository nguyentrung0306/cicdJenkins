pipeline {
    agent any

    triggers {
        pollSCM '* * * * *' 
    }
    
    stages {
        stage('Build') {
            steps {
//                 sh "'${mvnHome}/bin/mvn' clean install"
                echo 'Building..'
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
