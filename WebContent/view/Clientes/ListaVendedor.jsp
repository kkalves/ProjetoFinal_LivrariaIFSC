<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/plugins/dataTables.bootstrap.min.js"></script>
<script type="text/javascript">
	$('#sampleTable').DataTable();
</script>

<script src="${pageContext.request.contextPath}/js/ListaProdutos.js"></script>
</head>
<body class="sidebar-mini fixed">
	<div class="wrapper">
		<!-- Navbar-->
		<header class="main-header hidden-print"> <a class="logo"
			href="index.jsp">Greenwich Village </a> <nav
			class="navbar navbar-static-top"> <!-- Sidebar toggle button-->
		<a class="sidebar-toggle" href="#" data-toggle="offcanvas"></a> <!-- Navbar Right Menu-->
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
		</nav> </header>
		<!-- Side-Nav-->
		<aside class="main-sidebar hidden-print"> <section
			class="sidebar"> <!-- Sidebar Menu-->
		<ul class="sidebar-menu">
			<li class="active"><a href="index.jsp"><i class="fa fa-home"></i><span>
						Pagina Inicial</span></a></li>
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
					<li class="treeview"><a href="#"><i class="fa fa-circle-o"></i><span>
								Cadastro Cliente</span><i class="fa fa-angle-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="/ProjetoFinal_Livraria/CadastroClienteFisico"><i
									class="fa fa-circle-o"></i> Cliente Físico</a></li>
							<li><a href="/ProjetoFinal_Livraria/CadastroClienteJuridico"><i
									class="fa fa-circle-o"></i><span> Cliente Juridico</span></a></li>
						</ul></li>
				</ul></li>
		</ul>
		</section> </aside>
		<div class="content-wrapper">
			<div class="page-title">
				<div>
					<h1>Lista de Vendedores</h1>
					<ul class="breadcrumb side">
						<li><i class="fa fa-home fa-lg"></i></li>
						<li>Vendedores</li>
						<li class="active"><a href="#">Lista Vendedor </a></li>
					</ul>
				</div>
				<div>
					<a class="btn btn-primary btn-flat"
						href="/ProjetoFinal_Livraria/ClienteFisico"><i
						class="fa fa-lg fa-plus"></i></a>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="form-group">
							<label class="control-label">Pesquisar Vendedor</label>
							<div class="input-group">
								<span class="input-group-addon">Nome</span> <input
									class="form-control" type="text" id="titulo-produto"><span
									class="input-group-btn">
									<button class="btn btn-primary" type="button" id="btn-buscar">Buscar</button>
								</span>
							</div>
						</div>
						<div class="card-body">
							<table class="table table-hover table-bordered" id="sampleTable">
								<thead>
									<tr>
										<th>Nome</th>
										<th>Email</th>
										<th>Sexo</th>
										<th>Cpf</th>
										<th>Telefone</th>
										<th>Endereço</th>
										<th>Editar</th>
										<th>Excluir</th>
									</tr>
								</thead>
								<tbody id="tabela-vendedor">
									<c:forEach items="${vendedor}" var="venddor">
										<tr>
											<td>${produto.getNome()}</td>
											<td>${produto.getEmail()}</td>
											<td>${produto.getSexo()}</td>
											<td>${produto.getCpf()}</td>
											<td>${produto.gettelefone()}</td>
											<td>${produto.getValor()}</td>
											<td><a
												href='/ProjetoFinal_Livraria/EditarVendedor?cpf=${vendedor.getCpf()}'>Editar</a></td>
											<td><a href="" class="delete-link"
												id='${vendedor.getCpf()}'>Excluir</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</head>
<body>
</head>
<body>

</body>
</html>