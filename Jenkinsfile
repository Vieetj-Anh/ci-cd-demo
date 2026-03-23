pipeline {
    agent any

    tools {
        maven 'Maven 3'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Vieetj-Anh/ci-cd-demo.git'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}