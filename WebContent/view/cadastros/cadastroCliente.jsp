<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
			<a class="logo"
				href="${pageContext.request.contextPath}/view/principal/index.html">Greenwich
				Village </a>
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
								<li><a
									href="${pageContext.request.contextPath}/view/principal/cadastroVendedor.jsp"><i
										class="fa fa-user fa-lg"></i>Usuário</a></li>
								<li><a
									href="${pageContext.request.contextPath}/view/principal/login.jsp"><i
										class="fa fa-sign-out fa-lg"></i>Logout</a></li>
							</ul></li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- Side-Nav-->
		<aside class="main-sidebar hidden-print">
			<section class="sidebar">
				<div class="user-panel">
					<!-- <div class="pull-left info">
						<p><c:out value="${vehicle.category}"  /></p>
						<p class="designation"></p>
					</div>-->
				</div>
				<!-- Sidebar Menu-->
				<ul class="sidebar-menu">
					<li class="treeview"><a href="#"><i class="fa fa-edit"></i><span>Cadastros
						</span><i class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="FormularioCadastroProduto."><i
									class="fa fa-circle-o"></i> Cadastro Produto</a></li>
							<li><a href="CadastroCliente.html"><i
									class="fa fa-circle-o"></i> Cadastro Cliente</a></li>
							<li><a href="form-custom.html"><i class="fa fa-circle-o"></i>
									Custom Components</a></li>
							<li><a href="form-samples.html"><i
									class="fa fa-circle-o"></i> Form Samples</a></li>
							<li><a href="form-notifications.html"><i
									class="fa fa-circle-o"></i> Form Notifications</a></li>
						</ul></li>
					<li class="treeview"><a href="#"><i class="fa fa-th-list"></i><span>Tables</span><i
							class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="table-basic.html"><i class="fa fa-circle-o"></i>
									Basic Tables</a></li>
							<li><a href="table-data-table.html"><i
									class="fa fa-circle-o"></i> Data Tables</a></li>
						</ul></li>
					<li class="treeview"><a href="#"><i
							class="fa fa-file-text"></i><span>Pages</span><i
							class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="blank-page.html"><i class="fa fa-circle-o"></i>
									Blank Page</a></li>
							<li><a href="page-login.html"><i class="fa fa-circle-o"></i>
									Login Page</a></li>
							<li><a href="page-lockscreen.html"><i
									class="fa fa-circle-o"></i> Lockscreen Page</a></li>
							<li><a href="page-user.html"><i class="fa fa-circle-o"></i>
									User Page</a></li>
							<li><a href="page-invoice.html"><i
									class="fa fa-circle-o"></i> Invoice Page</a></li>
							<li><a href="page-calendar.html"><i
									class="fa fa-circle-o"></i> Calendar Page</a></li>
							<li><a href="page-mailbox.html"><i
									class="fa fa-circle-o"></i> Mailbox</a></li>
							<li><a href="page-error.html"><i class="fa fa-circle-o"></i>
									Error Page</a></li>
						</ul></li>
						<li><a href="charts.html"><i class="fa fa-pie-chart"></i><span>Charts</span></a></li>
					<li class="treeview"><a href="#"><i class="fa fa-share"></i><span>Multilevel
								Menu</span><i class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="blank-page.html"><i class="fa fa-circle-o"></i>
									Level One</a></li>
							<li class="treeview"><a href="#"><i
									class="fa fa-circle-o"></i><span> Level One</span><i
									class="fa fa-angle-right"></i></a>
								<ul class="treeview-menu">
									<li><a href="blank-page.html"><i
											class="fa fa-circle-o"></i> Level Two</a></li>
									<li><a href="#"><i class="fa fa-circle-o"></i><span>
												Level Two</span></a></li>
								</ul></li>
						</ul></li>
				</ul>
			</section>
		</aside>

		<div class="content-wrapper">
			<div class="page-title">
				<div>
					<h1>
						<i class="fa fa-edit"></i>Cadastro Cliente
					</h1>
					<p></p>
				</div>
				<div>
					<ul class="breadcrumb">
						<li><i class="fa fa-home fa-lg"></i></li>
						<li>Formulario</li>
						<li><a href="#">Cadastro Cliente</a></li>
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="card">
						<h3 class="card-title">Cadastro</h3>
						<div class="card-body">
							<form>
								<div class="form-group">
									<label class="control-label">Nome Cliente completo</label> <input
										class="form-control" name="nome"
										placeholder="Digite o nome do cliente ">
								</div>
								<div class="form-group">
									<label class="control-label">Email</label> <input
										class="form-control" name="email"
										placeholder="Email do cliente">
								</div>
								<div class="controls">
									<label for="sexo">Sexo:</label><br /> <input type="radio"
										name="sexo" value="masculino" /> Masculino<br /> <input
										type="radio" name="sexo" value="feminino" /> Feminino<br />
								</div>
								<br>
								<div class="form-group">
									<label class="control-label">Cpf</label> <input
										class="form-control" name="cpf" placeholder="CPF do cliente">
								</div>
								<div class="form-group">
									<label class="control-label">Endereço</label> <input
										class="form-control" name="endereço"
										placeholder="Endereço do cliente">
								</div>
								<div class="form-group">
									<label class="control-label">Bairro</label> <input
										class="form-control" name="bairro"
										placeholder="Bairro do cliente">
								</div>
								<div class="form-group">
									<label class="control-label">Telefone</label> <input
										class="form-control" name="telefone"
										placeholder="Telefone do cliente">
								</div>
								<div class="form-group">
									<label class="control-label">Cidade</label> <input
										class="form-control" name="cidade"
										placeholder="Cidade do cliente">
								</div>
								<div class="form-group">
									<label class="control-label">Estado</label> <input
										class="form-control" name="estado"
										placeholder="Estado do cliente">
								</div>
							</form>
						</div>
						<div class="card-footer">
							<button class="btn btn-primary icon-btn" type="button">
								<i class="fa fa-fw fa-lg fa-check-circle"></i>Cadastrar
							</button>
							&nbsp;&nbsp;&nbsp;<a class="btn btn-default icon-btn" href="#"><i
								class="fa fa-fw fa-lg fa-times-circle"></i>Cancelar</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>