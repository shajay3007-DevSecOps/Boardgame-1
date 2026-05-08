pipeline { 
    agent any
    tools {
        maven 'maven3.9'
        jdk 'JDK17'
    }
    stages {
         stage('compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
