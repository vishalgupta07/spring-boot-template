pipeline {
    // node we would like to run the code
    agent any

    stages {
        stage('Package') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Package is complete'
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mv test'
            }
            post {
                success {
                    echo 'Test is complete'
                }
            }
        }
        stage('Fetch approvals') {
            steps {
                timeout(time: 2, unit: 'HOURS') {
                    input message: 'Approve for deployment?', submitter: 'admin'
                }
                post {
                    success {
                        echo "Approved/rejected by admin"
                    }
                }
            }
        }
        stage('Deploy to production') {
            steps {
                echo "Deploy to production"
            }
        }
    }
}