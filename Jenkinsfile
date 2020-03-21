pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk8'
      args '-v /Users/slawek/.m2/repository'
    }

  }
  stages {
    stage('Initialize') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }

  }
}