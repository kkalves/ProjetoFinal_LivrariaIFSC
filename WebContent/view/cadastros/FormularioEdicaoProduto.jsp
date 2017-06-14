<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">
<title>Greenwich Village</title>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries-->
<!--if lt IE 9
    script(src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js')
    script(src='https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js')
    -->
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
								<li><a href="/ProjetoFinal_Livraria/listaVendedores"><i
										class="fa fa-user fa-lg"></i> Usuário</a></li>
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
						<i class="fa fa-edit"></i>Cadastro Produto
					</h1>
					<p>Produto</p>
				</div>
				<div>
					<ul class="breadcrumb">
						<li><i class="fa fa-home fa-lg"></i></li>
						<li>Formulario</li>
						<li><a href="#">Cadastro Produto</a></li>
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="card">
						${mensagem}
						<h3 class="card-title">Cadastro</h3>
						<div class="card-body">
							<form method="post" action="">
								<div class="form-group">
									<label class="control-label">Título</label> <input
										class="form-control" name="titulo"
										placeholder="Título da Obra" value='${produto.titulo}'>
								</div>
								<div class="form-group">
									<label class="control-label">Autor</label> <input
										class="form-control" name="autor"
										placeholder="Nome completo autor" value='${produto.autor}'>
								</div>
								<div class="form-group">
									<label class="control-label">Editora</label> <input
										class="form-control" name="editora" placeholder="Editora"
										value='${produto.editora}'>
								</div>
								<div class="form-group">
									<label class="control-label">Número Edição</label> <input
										class="form-control" name="numero-edicao"
										placeholder="Número Edição" value='${produto.numero}'>
								</div>
								<div class="form-group">
									<label class="control-label">Ano</label> <input
										class="form-control" name="ano"
										placeholder="Ano de publicação da Edição"
										value='${produto.ano}'>
								</div>
								<div class="form-group">
									<label class="control-label">ISBN</label> <input
										class="form-control" name="isbn" placeholder="ISBN"
										value='${produto.isbn}'>
								</div>
								<div class="form-group">
									<label class="control-label">Descrição</label>
									<textarea class="form-control" name="descricao"
										placeholder="Breve descrição da obra">${produto.descricao}</textarea>
								</div>
								<div class="form-group">
									<label class="control-label">Valor da Obra</label> <input
										class="form-control" name="valor" placeholder="Valor da Obra"
										value='${produto.valor}'>
								</div>
								<div class="card-footer">
									<input class="btn btn-primary icon-btn" type="submit"
										value="Editar">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>