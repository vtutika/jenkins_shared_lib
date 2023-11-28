#!/usr/bin/env groovy

def call(String artifactoryUrl, String repository, String filePath, String accessTokenVariable) {
    sh "jf rt upload --url ${artifactoryUrl} --access-token \${${accessTokenVariable}} ${filePath} ${repository}/"
}
