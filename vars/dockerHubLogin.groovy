// vars/dockerHubLogin.groovy
def call(String dockerHubUserName, String dockerHubPassword) {
    sh <<-EOF
        echo "-------- Logging to DockerHub --------"
        echo "$dockerHubPassword" | docker login -u "$dockerHubUserName" --password-stdin
        echo "-------- Successfully Logged in --------"
    EOF
}
