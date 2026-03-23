pipeline {
    agent any

    tools {
        maven 'Maven 3'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/YOUR_USERNAME/YOUR_REPO.git'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}