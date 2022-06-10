<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<form action=""method>
<label for="member_id">■会員番号</label>
	<p><input type="text" name="member_id" id="member_id">
	<button type="button" name="search" value="検索">検索</button></p>
</form>
<form action="" method="post">
	<label for="name">■名前</label>
	<p>姓　<input type="text" name="last_name" id="name" maxlength="32">
	名　<input type="text" name="first_name" id="name"></p>

	<label for="sex">■性別</label>
	<p><input type="radio" name="sex" id="sex" value="男">男
	<input type="radio" name="sex" id="sex" value="女">女</p>


	<label for="birth">■生年月日</label>
	<p></p>

	<label for="job">■職業</label>
	<p>
	<select name="job">
		<option value="" selected hidden></option>
		<option value="会社員">会社員</option>
		<option value="自営業">自営業</option>
		<option value="学生">学生</option>
		<option value="その他">その他</option>
	</select>
	</p>

	<label for="phone_number">■電話番号</label>
	<p><input type="number" name="phone_number" id="phone_number" maxlength="32"></p>

	<label for="mail_address">■メールアドレス</label>
	<p><input type="text" name="mail_address" id="mail_address" maxlength="32"></p>

<button type="submit" value="戻る">戻る</button>
<button type="reset" value="リセット">リセット</button>
<button type="submit" value="更新">更新</button>
</form>
</body>
</html>