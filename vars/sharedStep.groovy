def call(String someParam) {
pipeline {
agent { label "slave" }
stages{
stage("Shared Stage 1") {
steps {
echo "My shared step with param ${someParam}"
}
}
stage("Shared Stage 2") {
steps{
echo "Another message"
}
}
}
}
}
