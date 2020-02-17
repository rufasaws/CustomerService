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
 }
}
stage('compile,unit test,Create Java Archive')
{
 steps{ 
  script{
   bat "mvn -f ${localCodelocation}pom.xml -X -e clean package"
  }
 }
}
