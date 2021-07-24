pipeline {
    agent any
    stages {
        stage('Package') {
            steps {
                echo "Package step"
            }
        }
        stage('Test') {
            steps {
                echo "Tests ran"
            }
        }
        stage('Fetch approvals') {
            steps {
                echo "Requesting approvals"
            }
        }
        stage('Deploy to production') {
            steps {
                echo "Deploy to production"
            }
        }
    }
}