def call(String dockerHubUserName, String dockerHubPassword) {
  sh """
    echo "-------- Logging to DockerHub --------"
    docker login -u ${dockerHubUserName} --password ${dockerHubPassword}
    echo "-------- Successfully Loggedin --------"
  """
}
