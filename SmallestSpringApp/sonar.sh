#!/bin/sh
echo "Token length: $(echo $SONAR_TOKEN | wc -c)"
sonar-scanner \
  -Dsonar.projectKey=shankarreddy1219_Smallest-spring-boot-sample \
  -Dsonar.organization=shankarreddy1219 \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login="$SONAR_TOKEN" \
  -Dsonar.sources=/harness/SmallestSpringApp/src
exit 0
