# DDDワークショップ課題
これは格安SIMをテーマにしたドメイン駆動設計の練習課題です。  
※実際の料金等は関係ありません。


# 格安SIM仕様書
## プラン
プランは3種類ある。詳細は以下のとおり。

### 1ギガ(スタート)  
料金は1000円/月。

### 3ギガ   
料金は2000円/月。

### 30ギガ 
料金は6000円/月。

## エンタメフリーオプション
対象サービスの動画や音楽をデータ通信量の制限なく楽しめるオプションです。  
プランが3ギガ/30ギガの場合購入可能。(1ギガは利用不可)。  
料金は1200円/月。


# 料金計算API仕様書
## GET /monthly-fee
月額料金を計算するAPI

## リクエスト
キー | 値
---|---
plan | g1, g3, g30
entame_free | true, false

### 例
```
http://localhost:8080/monthly-fee?plan=g1&entame_free=false
```

## レスポンス
### 正常
status code: 200  
body: `{"monthly_fee":1000}`

### 異常
status code: 400  
(実装上はRuntimeExceptionを発生させると、400で返ります)


# コーディング規約
- 継承禁止(委譲を使う)
- ドメイン層でプリミティブ型禁止(必ずラップする)
- ドメイン層でnull禁止
- 日本語クラス、日本語メソッド利用可(時間がないから)

