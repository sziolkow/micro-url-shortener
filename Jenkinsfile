pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''                sh \'echo "Hello World"\'
                sh \'\'\'
                    echo "Multiline shell steps works too"
                    ls -lah
                \'\'\''''
      }
    }

  }
}