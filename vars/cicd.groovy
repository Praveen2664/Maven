def download() {
    echo 'Downloading project from Git...'
}

def build() {
    echo 'Building with Maven...'
    sh 'mvn clean package'
}

def deploy() {
    echo 'Deploying application...'
    sh '''
        curl --upload-file webapp/target/myapp.war \
        --user tomcatuser:tomcatpass \
        http://localhost:8080/manager/text/deploy?path=/myapp&update=true
    '''
}

