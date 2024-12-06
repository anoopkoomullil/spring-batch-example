pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                 cmd_failsafe('mvn -B -DskipTests clean package')
            }
        }
        stage('Test') {
            steps {
                cmd_failsafe('mvn test')
            }
            post {
                always {
                    junit allowEmptyResults: true, testResults: '**/surefire-reports/*.xml'
                    //junit '**/surefire-reports/*.xml'
                }
            }
        }
    }
}
def cmd(command) {
    // при запуске Jenkins не в режиме UTF-8 нужно написать chcp 1251 вместо chcp 65001
    if (isUnix()) { sh "${command}" } else { bat "chcp 65001\n${command}"}
}
def cmd_failsafe(command) {
    // при запуске Jenkins не в режиме UTF-8 нужно написать chcp 1251 вместо chcp 65001
    if (isUnix()) { sh "${command}" } else { bat (script: "chcp 65001\n${command}",  returnStatus: true)}
}
