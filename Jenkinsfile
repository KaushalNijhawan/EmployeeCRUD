pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps { 
                echo 'Building Phase ...' 
            }
        }
        stage('Test'){
            steps {
                echo "Test Phase .."           
            }
        }
        stage('Deploy') {
            steps {
                echo "Building Phase ....."
            }
        }
    }
}
