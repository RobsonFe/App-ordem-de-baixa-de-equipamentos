<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("cadastro");

//for(int i = 0; i < lista.size(); i++){
	//out.println(lista.get(i).getIdDF());
	//out.println(lista.get(i).getNome());
	//out.println(lista.get(i).getQuant());
	//out.println(lista.get(i).getTomb());
	//out.println(lista.get(i).getText());
	//out.println(lista.get(i).getValor());
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cadastro de Produtos</title>
<link rel="icon" href="img/pc.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Cadastro de Produtos</h1>
	<a href="novo.html" class="botao1">Novo Cadastro</a>
	<a href="index.html" class="botao1">Página Inicial</a>
	<br>
	<br>
	<table id="tabela">
	<tr>
	<thead> 
	<th>Id</th>
	<th>Nome</th>
	<th>Quantidade</th>
	<th>Tombamento</th>
	<th>Informações</th>
	<th>Valor</th>
	</tr>
	</thead>
	<thody>
	<%for(int i = 0; i < lista.size(); i++){ %>
	<tr>
	<td><%=lista.get(i).getIdDF()%></td>
	<td><%=lista.get(i).getNome()%></td>
	<td><%=lista.get(i).getQuant()%></td>
	<td><%=lista.get(i).getTomb()%></td>
	<td><%=lista.get(i).getText()%></td>
	<td><%=lista.get(i).getValor()%></td>
	</tr>
	<%} %>
	</thody>
	</table>
</body>
</html>