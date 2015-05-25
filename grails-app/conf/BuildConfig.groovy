grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'

    repositories {
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    plugins {
        build(':release:3.1.0', ':rest-client-builder:2.1.0') {
            export = false
        }

        runtime ':resources:1.2.8', {
            export = false
        }
    }
}