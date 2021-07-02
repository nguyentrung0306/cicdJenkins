// pipeline {
//     agent any

//     triggers {
//         pollSCM '* * * * *' 
//     }
    
//     stages {
//         stage('Build') {
//             steps {
//                 sh "mvn clean package"
//             }
//         }
//         stage('Build Docker Image') {
//             steps {
//                 sh 'docker build -t trungnd01/testImages .'
//             }
//         }
// //         stage('Test') {
// //             steps {
// //                 echo 'Testing..'
// //             }
// //         }
// //         stage('Deploy') {
// //             steps {
// //                 echo 'Deploying......'
// //             }
// //         }
//     }
// }

pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
