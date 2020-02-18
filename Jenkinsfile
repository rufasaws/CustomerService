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
   "mvn -f ${localcodelocation}pom.xml -X -e clean package"
  }
 }
}
}
}
