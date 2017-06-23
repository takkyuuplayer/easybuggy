[![Build Status](https://travis-ci.org/k-tamura/easybuggy.svg?branch=master)](https://travis-ci.org/k-tamura/easybuggy)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

EasyBuggy
=

EasyBuggyは、[メモリリーク、デッドロック、JVMクラッシュ、SQLインジェクションなど](https://github.com/k-tamura/easybuggy/wiki)、バグや脆弱性の動作を理解するためにつくられたバグだらけのWebアプリケーションです。

![logo](https://github.com/k-tamura/easybuggy/blob/master/src/main/webapp/images/easybuggy.png)


クイックスタート
-

    $ mvn clean install exec:exec

( または[JVMオプション](https://github.com/k-tamura/easybuggy/blob/master/pom.xml#L204)付きで ``` java -jar easybuggy.jar ``` か任意のサーブレットコンテナに ROOT.war をデプロイ。 )
( またはDockerを利用して ``` cd docker && make up ``` )

以下にアクセス:

    http://localhost:8080


停止するには:

  <kbd>CTRL</kbd>+<kbd>C</kbd>をクリック
  

詳細は
-
   
[wikiページ](https://github.com/k-tamura/easybuggy/wiki)を参照下さい。
