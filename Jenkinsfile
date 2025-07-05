@Library('samplelibrary') _
pipeline {
    agent any
    stages {
        stage('Download_Master') {
            steps {
                script {
                    cicd.download()
                }
            }
        }
        stage('Build_Master') {
            steps {
                script {
                    cicd.build()
                }
            }
        }
        stage('Deployment_Master') {
            steps {
                script {
                    cicd.deploy()
                }
            }
        }
        stage('Testing_Master') {
            steps {
                script {
                    cicd.download()
                    // Placeholder for test logic - update when you add runSelenium()
                    echo 'Running tests...'
                }
            }
        }
        stage('Delivery_Master') {
            steps {
                script {
                    cicd.deploy()
                }
            }
        }
    }
}
