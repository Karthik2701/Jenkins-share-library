def call() {
    sh 'trivy image karthik2701/youtube:${BUILD_NUMBER} > trivyimage.txt'
}
