//declarative pipeline
pipeline {
    agent any
    stages {
        stage("say hello world") {
            step {
                println "Hello world, this is prasad"
            }
        }

    }
}