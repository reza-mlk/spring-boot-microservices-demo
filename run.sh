#!/bin/bash

set -e

echo "🔨 Building Service Registry..."
cd product-service
mvn clean package -DskipTests
cd ..

echo "🔨 Building User Service..."
cd user-service
mvn clean package -DskipTests
cd ..

echo "🔨 Building User Service..."
cd config-server
mvn clean package -DskipTests
cd ..

echo "🐳 Building and starting Docker containers..."
docker compose up -d --build

echo ""
echo "✅ Services are running!"
echo ""
docker compose ps
