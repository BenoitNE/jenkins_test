pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone le référentiel GitHub
                checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/BenoitNE/jenkins_test.git']]])
            }
        }

        stage('Build and Install') {
            steps {
                // Utilise Maven pour construire et installer le projet
                sh "${MAVEN_HOME}/bin/mvn clean install"
            }
        }

        stage('Copy JAR to Local') {
            steps {
                // Copie le fichier JAR généré dans un dossier local
                script {
                    def jarName = sh(script: 'ls target/*.jar', returnStdout: true).trim()
                    sh "cp ${jarName} /Users/benoitnerin/Documents/"
                }
            }
        }
    }

    post {
        success {
            echo 'Build et installation réussies. JAR copié en local.'
        }
        failure {
            echo 'Échec de la build ou de l\'installation du projet.'
        }
    }
}
