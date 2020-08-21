pipelineJob('bundle-jenkins-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/msheviakou/bundle-jenkins'
                    }
                    branch 'master'
                }
            }
        }
    }
}
