<%@ page language="java" contentType="text/html; charset=utf8"
        pageEncoding="utf8" %>
<%@ page import="com.google.appengine.api.users.*" %>
<%
User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>メニュー画面</title>
		<script type="text/javascript" src="lib.js"></script>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<h1>メニュー画面</h1>
		<form action="/add" method="post">
			<table>
				<tr>
				<td>マルゲリータ（水牛のモッツァレラチーズ・フレッシュバジリコ）</td>
				<td><select name="size1">
						<option value="S">S +￥0</option>
						<option value="M">M +￥250</option>
						<option value="L">L +￥500</option>
				</select></td>
				<td><select name="num1">
						<option value="0">0枚</option>
						<option value="1">1枚</option>
						<option value="2">2枚</option>
						<option value="3">3枚</option>
						<option value="4">4枚</option>
						<option value="5">5枚</option>
						<option value="6">6枚</option>
						<option value="7">7枚</option>
						<option value="8">8枚</option>
						<option value="9">9枚</option>
						<option value="10">10枚</option>
				</select></td>
			</tr>
			<tr>
				<td>マリナーラ（アンチョビ・オレガノ・ニンニクオイル）</td>
				<td><select name="size2">
						<option value="S">S +￥0</option>
						<option value="M">M +￥250</option>
						<option value="L">L +￥500</option>
				</select></td>
				<td><select name="num2">
						<option value="0">0枚</option>
						<option value="1">1枚</option>
						<option value="2">2枚</option>
						<option value="3">3枚</option>
						<option value="4">4枚</option>
						<option value="5">5枚</option>
						<option value="6">6枚</option>
						<option value="7">7枚</option>
						<option value="8">8枚</option>
						<option value="9">9枚</option>
						<option value="10">10枚</option>
				</select></td>
			</tr>
			<tr>
				<td>オルトラーナ（たっぷり野菜・パルミジャーノ）</td>
				<td><select name="size3">
						<option value="S">S +￥0</option>
						<option value="M">M +￥250</option>
						<option value="L">L +￥500</option>
				</select></td>
				<td><select name="num3">
						<option value="0">0枚</option>
						<option value="1">1枚</option>
						<option value="2">2枚</option>
						<option value="3">3枚</option>
						<option value="4">4枚</option>
						<option value="5">5枚</option>
						<option value="6">6枚</option>
						<option value="7">7枚</option>
						<option value="8">8枚</option>
						<option value="9">9枚</option>
						<option value="10">10枚</option>
				</select></td>
			</tr>
		</table>
		<p>
		<table>
		<tr><td>お名前</td><td><input type="text" name="name"></td></tr>
		<tr><td>お届け先</td><td><input type="text" name="address"></td></tr>
		</table>
		</p>
		<input type="submit" value="注文" />
		<br>
		</form>
		        <h1>Private Page</h1>
        <div>※このページは、公開されていないプライベートなページです。</div>
        <div style="font-weight: bold;">ユーザー：<%=user.getNickname() %></div>
        <br>
        <a href="/logout">Logout</a>
</body>
</html>