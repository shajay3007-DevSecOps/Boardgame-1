pipeline {
    agent any
    tools {
        maven 'maven3.9'
        jdk 'JDK17'
    }
    stages {
         stage('git checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/shajay3007-DevSecOps/Boardgame-1.git'
            }
        }
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
