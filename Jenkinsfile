pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Vieetj-Anh/ci-cd-demo.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}