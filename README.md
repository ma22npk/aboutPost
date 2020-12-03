# aboutPost
【Java】POSTについての学習リポジトリ
<!-- タイトルを記述 -->
#  【Java】POST ( データの受け渡し )

「登録処理や更新処理をおこなう」

<!--  上記の詳しい説明 -->
## 【説明】
POSTメソッドは、HTTPの[メソッド]の一つで、主に登録処理や更新処理などの書き込みがあり、リソースが更新される可能性のある処理に対して使うメソッドになります。

<!-- メリット「使うことのメリット」 -->
## 【メリット】

- [GET]送信よりも多くのデータ量を扱える
- バイナリーデータ（2進数）が送信可能

<!-- 特徴「特筆すべき所」 -->
## 【特徴】

- [GET]とは反対に結果にバラ付きがあり安全でないと定義されています。
- パラメーター等の値がリクエストURLには表示されず、メッセージボディに格納される


<!-- 使用場面 「いつつかうか？」「どこで、つかうか？」-->
## 【使用場面】

- サーバからの情報取得時に使用
- HTMLの `form` に入力された内容をDBへ登録する
- ブログの記事を投稿する
- 新しいユーザを登録する
- 既存のデータに新しい情報を付加する


<!-- ここから 各キャプチャー↓↓↓↓↓↓↓↓↓↓↓↓↓↓ -->
<!-- サンプルコード、サブセクションを記述↓↓↓↓↓ -->

<!-- ここから キャプチャー -+-+-+-+-+-+-+ -->
<!-- キャプチャータイトル -->
## getParameterValuesメソッド (複数の値を取得する)

[getParameter()]は一つの引数に対して取得しますが、1つの引数に対して複数の値が送られてくることもあります。
その際に使用するのが getParameterValues メソッドです。

## 【書式】getParameterValuesメソッドの書き方

### getParameterメソッド
比較のために復習を兼ねて、[getParameter()]メソッドの書き方がこちらです。

```java
String values[] = request.getParameterValues("args");
```

### getParameterValuesメソッド
以下がgetParameterValuesメソッドです。
複数の値が返されるので、配列として宣言しています。

```java
String values[] = request.getParameterValues("args");
```


<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->

## 【サンプル】HTML / JSPのチェックボックスの値をJavaが受け取る

### 【HTML / JSP】

```html
// スポーツのチェックボックス
<form action="送信先" method="post"> //postメソッドを指定
    <!-- 	肉 -->
    <input type="checkbox" name="foods" value="meet" /> 
    <!-- 	魚 -->
    <input type="checkbox" name="foods" value="fish" />
    <!-- 	野菜 -->
    <input type="checkbox" name="foods" value="vegetable" />
    <!-- 	果物 -->
		<input type="checkbox" name="foods" value="fruits" />
    <input type="submit" value="送信" />
</form>
```
### 【Java】

```java
// 各チェックボックスのvalueの値が取得可能です
String sports[] = request.getParameterValues("foods");
```


<!-- サンプルコードや、サブセクションを記述↑↑↑↑↑ -->
<!-- ここまで 各キャプチャー↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ -->




<!-- 参考にした資料のリンクを貼る -->

<!-- 以下ショートリンク↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ -->

[Progate]:https://prog-8.com/
[ドットインストール]:https://dotinstall.com/

[abstract修飾子]:https://qiita.com/takahirocook/items/9fa0e1cbb8a4dd4e1ff4
[abstract]:https://qiita.com/takahirocook/items/9fa0e1cbb8a4dd4e1ff4
[import]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[super]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[final]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[final修飾子]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[List]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[length]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[list]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[Map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Date]:https://qiita.com/takahirocook/items/a760e20ef2d9aa5c08fc
[SimpleDateFormat]:https://qiita.com/takahirocook/items/aa857c8f2153193095e4
[Time]:https://qiita.com/takahirocook/items/9caef0bb2409caedba55
[Calendar]:https://qiita.com/takahirocook/items/204dd7331db777eb6f3b
[mainメソッド]:https://qiita.com/takahirocook/items/f4635915337303de338c
[printf()メソッド]:https://qiita.com/takahirocook/items/06d525be63eccd99ed49
[printf()関数]:https://qiita.com/takahirocook/items/06d525be63eccd99ed49
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[getter・setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[getter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[new演算子]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[new]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[static修飾子]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[static]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[web.xml]:https://qiita.com/takahirocook/items/d41a92bd36807d456f82
[GET]:https://qiita.com/takahirocook/items/8080a478439f6043b2c1
[GETメソッド]:https://qiita.com/takahirocook/items/8080a478439f6043b2c1
[getParameter()]:https://qiita.com/takahirocook/items/8080a478439f6043b2c1
[getParameter]:https://qiita.com/takahirocook/items/8080a478439f6043b2c1
[getParameterメソッド]:(https://qiita.com/takahirocook/items/8080a478439f6043b2c1)
[getParameterValues]:https://qiita.com/takahirocook/items/7a071493ae73cc4749e1
[getParameterValuesメソッド]:https://qiita.com/takahirocook/items/7a071493ae73cc4749e1
[POST]:https://qiita.com/takahirocook/items/7a071493ae73cc4749e1
[POSTメソッド]:https://qiita.com/takahirocook/items/7a071493ae73cc4749e1



<!-- あ行 -->
[オブジェクト指向]:https://qiita.com/takahirocook/items/041ba7a096b71ab8ffd4
[継承]:https://qiita.com/takahirocook/items/6c84ea66a6e2ad536a37
[オーバーライド]:https://qiita.com/takahirocook/items/09dd8e5f56d6617ce45a
[オーバーロード]:https://qiita.com/takahirocook/items/b937c3c07126fe7e02a4
[インスタンス]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[インスタンス化]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[アクセス修飾子]:https://qiita.com/takahirocook/items/e51b0b9d37d95ad587fe
[インスタンス化]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インターフェイス]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[インターフェース]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[インポート]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[インデックス]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
<!-- か行 -->
[拡張for文]:https://qiita.com/takahirocook/items/470b2858de1a4f99b334
[クラスメソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[カプセル化]:https://qiita.com/takahirocook/items/e469a7c0539a0012868e
[クラス]:https://qiita.com/takahirocook/items/50cbbdca8e21539170e9
[コンストラクタ]:https://qiita.com/takahirocook/items/fa1822f2f22c3786593e
<!-- さ行 -->
[書式指定子]:https://qiita.com/takahirocook/items/06d525be63eccd99ed49
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[スーパークラス]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
<!-- た行 -->
[定数]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[抽象クラス]:https://qiita.com/takahirocook/items/9fa0e1cbb8a4dd4e1ff4
[抽象メソッド]:https://qiita.com/takahirocook/items/9fa0e1cbb8a4dd4e1ff4
[動的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
<!-- な行 -->
[日時の文字列操作]:https://qiita.com/takahirocook/items/aa857c8f2153193095e4
<!-- は行 -->
[パッケージ]:https://qiita.com/takahirocook/items/39b58d17abcb159ef5c1
[引数]:https://qiita.com/takahirocook/items/5e5b0ba79e869f4a592e
[配列]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[配列操作]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[日付操作]:https://qiita.com/takahirocook/items/9caef0bb2409caedba55
[フィールド]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[フィールド変数]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[インスタンスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
<!-- ま行 -->
[戻り値]:https://qiita.com/takahirocook/items/3b6fa670a1d6dd4a9386
[メソッド]:https://qiita.com/takahirocook/items/5bfe43576d87a2a4006c
[メソッドの呼び出し]:https://qiita.com/takahirocook/items/f4635915337303de338c
<!-- や行 -->
<!-- ら行 -->
<!-- わ行 -->
