pipelineJob('spring-boot-app-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ajitsangwan2006/spring-boot-app.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}