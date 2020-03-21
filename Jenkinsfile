pipeline {
  agent {
    docker {
      args '-v /Users/slawek/.m2/repository'
      image 'maven:3.6.3-jdk-8'
    }

  }
  stages {
    stage('Initialize') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean
'''
      }
    }

    stage('Build') {
      steps {
        sh 'mvn -Dmaven.test.failure.ignore=true install'
      }
    }

    stage('Report') {
      steps {
        junit 'target/surefire-reports/**/*.xml'
        archiveArtifacts 'target/.jar.target/*.hpi'
      }
    }

  }
}