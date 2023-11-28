#!/usr/bin/env groovy

def call(String artifactoryUrl, String repository, String filePath, String accessTokenVariable) {
    sh "jf rt upload --url http://18.212.52.144:8082/artifactory/ --access-token \${ARTIFACTORY_ACCESS_TOKEN} kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar example-repo-local/"
}
