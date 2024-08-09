def gitdownload(repo)
{
    git "https://github.com/konkatimanojkumar/${repo}.git"
}
def mavenbuild()
{
   sh 'mvn package'
}
def gitdeploy(jobname,ipaddress,context)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress} /var/lib/tomcat9/webapps/${context}.war
}
