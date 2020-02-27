// **** Start App Specific Variables ****

localcodelocation ="source/customer-service/"

// **** End App Specific Variables ****

pipeline
{
agent any
stages{
 stage ('initialize pipeline for job')
 {
 steps{
 script{
 checkout scm
 }
 }
 }
 stage('Compile, Unit Test, Create Java Archive')
{
 steps{ 
  script{
   sh "mvn -f ${localcodelocation}pom.xml -X -e clean package"
  }
 }
}
 stage('Perf Deployment')
 {
 steps{
  script{
   sh 'scp /var/lib/jenkins/workspace/CustomerService/source/customer-service/target/CustomerService.jar ubuntu@172.31.88.218:/var/lib/tomcat8/webapps/testapp.war'
}
}
 }
}
}
