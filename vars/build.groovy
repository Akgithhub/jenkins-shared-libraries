def call(){
  echo 'This is a build stage'
  sh 'whoami'
  sh 'docker build -t notes-app:latest .'  
}
