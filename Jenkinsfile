pipeline {
    agent any
  
    tools {
          maven 'sonarmaven'  // Install Maven tool in Jenkins
    }

    stages {
        stage('CheckOut') {
            steps {
                git branch: "main", url: "https://github.com/HarshG777/bootstrap.git"
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('PMD and CPD Checks') {
            steps {
                bat '''
                mvn pmd:check
                mvn pmd:cpd
                '''
            }
        }

        stage('SonarQube Analysis') {
            environment {
                SONAR_TOKEN = credentials('sonarQub-token') // Replace with your Jenkins credential ID
            }
            steps {
                bat '''
                mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=LoginMaven \
                    -Dsonar.projectName='LoginMaven' \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.token=sqp_002e1274b3e50f109d903c53ba3e622e4c2ba120 \
                    -Dsonar.java.coveragePlugin=jacoco \
                    -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml
                '''
            }
        }
    }

    post {
        success {
            echo "Pipeline executed successfully with code coverage and duplication checks!"
        }
        failure {
            echo "Pipeline failed. Check the logs for details."
        }
    }
}
