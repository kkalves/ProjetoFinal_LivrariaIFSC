<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- CSS-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/dataTables.bootstrap.min.js"></script>
    <script type="text/javascript">$('#sampleTable').DataTable();</script>
    
    <script src="${pageContext.request.contextPath}/js/ListaProdutos.js"></script>
  </head>
  <body class="sidebar-mini fixed">
    <div class="wrapper">
      <!-- Navbar-->
      <header class="main-header hidden-print"><a class="logo" href="index.html">Greenwich Village</a>
        <nav class="navbar navbar-static-top">
          <!-- Sidebar toggle button--><a class="sidebar-toggle" href="#" data-toggle="offcanvas"></a>
          <!-- Navbar Right Menu-->
          <div class="navbar-custom-menu">
            <ul class="top-nav">
              <!-- User Menu-->
              <li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user fa-lg"></i></a>
                <ul class="dropdown-menu settings-menu">
                  <li><a href="page-user.html"><i class="fa fa-cog fa-lg"></i> Settings</a></li>
                  <li><a href="page-user.html"><i class="fa fa-user fa-lg"></i> Profile</a></li>
                  <li><a href="page-login.html"><i class="fa fa-sign-out fa-lg"></i> Logout</a></li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>
      <!-- Side-Nav-->
      <aside class="main-sidebar hidden-print">
        <section class="sidebar">
          <div class="user-panel">
            <div class="pull-left image"><img class="img-circle" src="file:///Users/priscillabittencourt/git/ProjetoFinal_LivrariaIFSC/WebContent/images/Priscilla.png" alt="User Image"></div>
            <div class="pull-left info">
              <p>Priscilla Bitencourt</p>
              <p class="designation">Escrava</p>
            </div>
          </div>
          <!-- Sidebar Menu-->
          <ul class="sidebar-menu">
            <li class="treeview"><a href="#"><i class="fa fa-shopping-basket"></i><span>Venda</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="/ProjetoFinal_Livraria/FrenteCaixa"><i class="fa fa-circle-o"></i> Frente Caixa</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-book"></i><span>Produtos</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="/ProjetoFinal_Livraria/listaProdutos"><i class="fa fa-circle-o"></i> Listar Produtos</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-edit"></i><span>Cadastros</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="/ProjetoFinal_Livraria/CadastroProduto"><i class="fa fa-circle-o"></i> Cadastro Produto</a></li>
              </ul>
            </li>          
          </ul>
        </section>
      </aside>
      <div class="content-wrapper">
        <div class="page-title">
          <div>
            <h1>Lista de Produtos</h1>
            <ul class="breadcrumb side">
              <li><i class="fa fa-home fa-lg"></i></li>
              <li>Produtos</li>
              <li class="active"><a href="#">Listar Produtos</a></li>
            </ul>
          </div>
          <div><a class="btn btn-primary btn-flat" href="/ProjetoFinal_Livraria/CadastroProduto"><i class="fa fa-lg fa-plus"></i></a></div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <div class="card">
         		 <div class="form-group">
          		 <label class="control-label">Pesquisar Produto</label>
             	 <div class="input-group"><span class="input-group-addon">Título</span>
                	<input class="form-control" type="text" id="titulo-produto"><span class="input-group-btn">
                	<button class="btn btn-primary" type="button" id="btn-buscar">Buscar</button></span>
             	 </div>
        		 </div> 
              <div class="card-body">
                <table class="table table-hover table-bordered" id="sampleTable">
                  <thead>
                    <tr>
                      <th>Título</th>
                      <th>Autor</th>
                      <th>Editora</th>
                      <th>Edição</th>
                      <th>ISBN</th>
                      <th>Valor</th>
                      <th>Editar</th>
                      <th>Excluir</th>
                    </tr>
                  </thead>
                  <tbody id="tabela-produtos">
                  <c:forEach items="${produtos}" var="produto">
	                  <tr>
	                  	<td>${produto.getTitulo()}</td>
	                  	<td>${produto.getAutor()}</td>
	                  	<td>${produto.getEditora()}</td>
	                  	<td>${produto.getNumero()}</td>
	                  	<td>${produto.getIsbn()}</td>
	                  	<td>${produto.getValor()}</td>
	                  	<td><a href='/ProjetoFinal_Livraria/editarProduto?isbn=${produto.getIsbn()}'>Editar</a></td>
	                  	<td><a href="" class="delete-link" id='${produto.getIsbn()}' >Excluir</a></td>
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
  </body>
</html>