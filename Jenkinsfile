pipeline {
    agent any
    environment {
        PROJECT_DIR = 'java_course_4.0_Kotiai-java-basics-testng'
    }
    stages {
        stage('Build') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh './gradlew build'
                }
            }
        }
        stage('Test') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh './gradlew test'
                }
            }
        }
        stage('Deploy - Staging') {
            steps {
                dir("${PROJECT_DIR}") {
                    echo 'Deploying to Staging environment...'
                    echo 'Running smoke tests on Staging...'
                }
            }
        }
        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Deploy - Production') {
            steps {
                dir("${PROJECT_DIR}") {
                    echo 'Deploying to Production environment...'
                }
            }
        }
    }
    post {
        always {
            dir("${PROJECT_DIR}") {
                archiveArtifacts artifacts: 'build/libs/*.jar', allowEmptyArchive: true
                junit 'build/test-results/**/*.xml'
            }
        }
        failure {
            mail to: 'forjavajenk@gmail.com',
                 subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
        success {
            mail to: 'forjavajenk@gmail.com',
                 subject: "Success Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Successfully done ${env.BUILD_URL}"
        }
    }
}
