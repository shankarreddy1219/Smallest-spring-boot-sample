#!/bin/sh
sonar-scanner \
  -Dsonar.projectKey=Smallest-spring-boot-sample \
  -Dsonar.organization=shankarreddy1219 \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login="$SONAR_TOKEN" \
  -Dsonar.sources=/harness/SmallestSpringApp/src
exit 0
