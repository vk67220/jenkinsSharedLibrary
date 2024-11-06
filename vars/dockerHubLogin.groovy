// vars/dockerHubLogin.groovy
def call(String dockerHubUserName, String dockerHubPassword) {
    // Use the `steps.sh` to ensure it runs in the Pipeline context
    steps.sh """
        echo "-------- Logging to DockerHub --------"
        echo "${dockerHubPassword}" | docker login -u "${dockerHubUserName}" --password-stdin
        echo "-------- Successfully Logged in --------"
    """
}
