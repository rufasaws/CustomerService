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
 stage('deployment')
 {
  steps{
   script{
    sh "scp /var/lib/jenkins/workspace/CustomerService/source/customer-service/target/customer-service.jar customer@172.17.0.2:/usr/local/tomcat/webapps/customer.jar"
   }
  }
 }
}
}
