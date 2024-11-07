def call() {
    withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh """
        docker login --username="${DOCKER_USERNAME}" --password="${DOCKER_PASSWORD}"
        """
    }
}
