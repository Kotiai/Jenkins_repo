pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                dir('java_course_4.0_Kotiai-java-basics-testng') {
                    sh './gradlew build'
                }
            }
        }
        stage('Test') {
            steps {
                dir('java_course_4.0_Kotiai-java-basics-testng') {
                    sh './gradlew test'
                }
            }
        }
    }
    post {
        always {
            dir('java_course_4.0_Kotiai-java-basics-testng') {
                archiveArtifacts artifacts: 'build/libs/*.jar', allowEmptyArchive: true
                junit 'build/test-results/**/*.xml'
            }
        }
    }
}

