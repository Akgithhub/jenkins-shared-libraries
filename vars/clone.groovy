def call(String url, String branch){
  echo 'This is a Code stage'
  git url: "${url}", branch: "${branch}"
  echo 'Repo is cloned sucessfully'
}
