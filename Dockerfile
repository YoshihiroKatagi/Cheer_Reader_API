# Java 21のイメージを使用
FROM openjdk:21
WORKDIR /app

# JARファイルをコピー
COPY target/cheer-reader-0.0.1-SNAPSHOT.jar app.jar

# ポートを公開
EXPOSE 8080

# アプリを起動
ENTRYPOINT ["java", "-jar", "app.jar"]
