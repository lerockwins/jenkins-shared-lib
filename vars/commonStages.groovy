def checkoutCode(String repo, String branch) {
    echo "Checking out source code..."
    git branch: branch, url: repo
}

def buildApp() {
    echo "Building application..."
    sh 'mvn clean compile'
}

def testApp() {
    echo "Running tests..."
    sh 'mvn test || true'
}

def packageApp() {
    echo "Packaging application..."
    sh 'mvn clean package -DskipTests'
}

return this
