#!/bin/bash
set -e
cd /harness/SmallestSpringApp
exec mvn clean test
