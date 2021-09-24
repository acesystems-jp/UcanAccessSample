# UcanAccessSample
SpringBoot + MyBatisでAccess（accdb）に接続するサンプル

## UcanAccess
ODBCを使わずにAccess(MDB,ACCDB)に接続するためのJDBCドライバ
http://ucanaccess.sourceforge.net/site.html[http://ucanaccess.sourceforge.net/site.html]

## 設定
1. pom.xmlにUCanAccessを取得する設定を記述する

```
<dependency>
    <groupId>net.sf.ucanaccess</groupId>
    <artifactId>ucanaccess</artifactId>
    <version>5.0.1</version>
</dependency>
```

2. application.ymlに接続設定を記述
```
spring.datasource:
  driver-class-name: net.ucanaccess.jdbc.UcanaccessDriver
  url: jdbc:ucanaccess://demo.accdb;memory=false;newDatabaseVersion=V2007
```

3. MyBatis
あとは通常通りMyBatisの記述でOK
