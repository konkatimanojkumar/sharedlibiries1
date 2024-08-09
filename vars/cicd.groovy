def gitdownload(repo)
{
    git "https://github.com/konkatimanojkumar/${repo}.git"
}
def mavenbuild()
{
   sh 'mvn package'
}
