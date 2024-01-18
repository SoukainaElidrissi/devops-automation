pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('build maven '){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/SoukainaElidrissi/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage('build docker image'){
            steps{
                script{
                    bat 'docker build -t soukaina2002/devops-integration  -f Dockerfile .'
                }
            }
        }
   stage('push docker image to docker hub') {
            steps {
                script {
                   withCredentials([string(credentialsId: 'token', variable: 'token')]) {
                       bat "docker login -u soukaina2002 -p ${token}"
}
                        bat 'docker push soukaina2002/devops-integration'
                    }

            }
        }
    }
}