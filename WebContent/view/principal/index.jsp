<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">
<title>Greenwich Village</title>
<!-- Javascripts-->
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/pace.min.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
</head>
<body class="sidebar-mini fixed">
	<div class="wrapper">
		<!-- Navbar-->
		<header class="main-header hidden-print">
			<a class="logo" href="index.jsp">Greenwich Village </a>
			<nav class="navbar navbar-static-top">
				<!-- Sidebar toggle button-->
				<a class="sidebar-toggle" href="#" data-toggle="offcanvas"></a>
				<!-- Navbar Right Menu-->
				<div class="navbar-custom-menu">
					<ul class="top-nav">
						<!-- User Menu-->
						<li class="dropdown"><a class="dropdown-toggle" href="#"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false"><i class="fa fa-user fa-lg"></i></a>
							<ul class="dropdown-menu settings-menu">
								<li><a href="/ProjetoFinal_Livraria/listaVendedores"><i class="fa fa-user fa-lg"></i>
										Usuário</a></li>
								<li><a href="login.jsp"><i class="fa fa-sign-out fa-lg"></i>
										Logout</a></li>
							</ul></li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- Side-Nav-->
		<aside class="main-sidebar hidden-print">
			<section class="sidebar">
				<!-- Sidebar Menu-->
				<ul class="sidebar-menu">
					<li class="active"><a href="index.jsp"><i
							class="fa fa-home"></i><span> Pagina Inicial</span></a></li>
					<li class="treeview"><a href="#"><i
							class="fa fa-shopping-basket"></i><span>Venda</span><i
							class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="/ProjetoFinal_Livraria/FrenteCaixa"><i
									class="fa fa-circle-o"></i> Frente Caixa</a></li>
						</ul></li>
					<li class="treeview"><a href="#"><i class="fa fa-book"></i><span>Consultas</span><i
							class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="/ProjetoFinal_Livraria/listaProdutos"><i
									class="fa fa-circle-o"></i> Listar Produtos</a></li>
							<li><a href="/ProjetoFinal_Livraria/listaFisico"><i
									class="fa fa-circle-o"></i> Listar Fisico</a></li>
							<li><a href="/ProjetoFinal_Livraria/listaJuridico"><i
									class="fa fa-circle-o"></i> Listar Juridico</a></li>
							<li><a href="/ProjetoFinal_Livraria/listaVendedores"><i
									class="fa fa-circle-o"></i> Listar Vendedores</a></li>
						</ul></li>
					<li class="treeview"><a href="#"><i class="fa fa-edit"></i><span>Cadastros</span><i
							class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="/ProjetoFinal_Livraria/CadastroProduto"><i
									class="fa fa-circle-o"></i> Cadastro Produto</a></li>
							<li><a href="/ProjetoFinal_Livraria/CadastroVendedor"><i
									class="fa fa-circle-o"></i> Cadastro Vendedor</a></li>
							<li class="treeview"><a href="#"><i
									class="fa fa-circle-o"></i><span> Cadastro Cliente</span><i
									class="fa fa-angle-right"></i></a>
								<ul class="treeview-menu">
									<li><a href="/ProjetoFinal_Livraria/CadastroClienteFisico"><i
											class="fa fa-circle-o"></i> Cliente Físico</a></li>
									<li><a
										href="/ProjetoFinal_Livraria/CadastroClienteJuridico"><i
											class="fa fa-circle-o"></i><span> Cliente Juridico</span></a></li>
								</ul></li>
						</ul></li>
				</ul>
			</section>
		</aside>
		<div class="content-wrapper">
			<div class="page-title">
				<div>
					<h1>
						<i class="fa fa-home"></i> Página Inicial
					</h1>
				</div>
			</div>
			<div class="col-md">
				<div class="card">
					<div class="row">
						<h1 align="center" class="card-title">
							Greenwich Village
							<p>
								<small>Cresça mais. Leia mais. Venda mais.</small>
							</p>
						</h1>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="card">
						<h3 class="card-title">
							<i class="fa fa-industry"></i> Missão
						</h3>
						<p>Trabalhamos com o objetivo de servir nossos clientes com
							confiabilidade, inovação e liderança na venda de nossos produtos
							e serviços.</p>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card">
						<h3 class="card-title">
							<i class="fa fa-eye"></i> Visão
						</h3>
						<p>Ter relações verdadeiras que permitirão envolver todos os
							colaboradores em um projeto comum, respeitando à individualidade
							de cada um.</p>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card">
						<h3 class="card-title">
							<i class="fa fa-heart"></i> Valores
						</h3>
						<p>Trabalhamos em um ambiente que promove a inclusão e acolhe
							as mudanças, novas idéias, respeito pelo indivíduo e igualdade de
							oportunidade de sucesso para todos.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>