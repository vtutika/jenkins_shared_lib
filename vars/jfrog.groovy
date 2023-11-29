#!/usr/bin/env groovy

def call(String artifactoryUrl, String repository, String filePath, String accessTokenVariable) {
    sh "jf rt upload --url http://54.164.49.22//artifactory/ --access-token \${ARTIFACTORY_ACCESS_TOKEN} kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar example-repo-local/"
}
