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
    <script src="${pageContext.request.contextPath}/js/frenteCaixa.js"></script>
    
  </head>
  <body class="sidebar-mini fixed">
    <div class="wrapper">
      <!-- Navbar-->
      <header class="main-header hidden-print"><a class="logo" href="index.html">Greenwich Village </a>
        <nav class="navbar navbar-static-top">
          <!-- Sidebar toggle button--><a class="sidebar-toggle" href="#" data-toggle="offcanvas"></a>
          <!-- Navbar Right Menu-->
          <div class="navbar-custom-menu">
            <ul class="top-nav">
              <!--Notification Menu-->
              <li class="dropdown notification-menu"><a class="dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-bell-o fa-lg"></i></a>
                <ul class="dropdown-menu">
                  <li class="not-head">You have 4 new notifications.</li>
                  <li><a class="media" href="javascript:;"><span class="media-left media-icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-primary"></i><i class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
                      <div class="media-body"><span class="block">Lisa sent you a mail</span><span class="text-muted block">2min ago</span></div></a></li>
                  <li><a class="media" href="javascript:;"><span class="media-left media-icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-danger"></i><i class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
                      <div class="media-body"><span class="block">Server Not Working</span><span class="text-muted block">2min ago</span></div></a></li>
                  <li><a class="media" href="javascript:;"><span class="media-left media-icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-success"></i><i class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
                      <div class="media-body"><span class="block">Transaction xyz complete</span><span class="text-muted block">2min ago</span></div></a></li>
                  <li class="not-footer"><a href="#">See all notifications.</a></li>
                </ul>
              </li>
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
              <p>Priscilla Bitencourt </p>
              <p class="designation">Escrava</p>
            </div>
          </div>
          <!-- Sidebar Menu-->
          <ul class="sidebar-menu">
            <li class="active"><a href="index.html"><i class="fa fa-dashboard"></i><span>Dashboard</span></a></li>
            <li class="treeview"><a href="#"><i class="fa fa-shopping-basket"></i><span>Venda</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="/view/venda/FrenteCaixa.jsp"><i class="fa fa-circle-o"></i> Frente Caixa</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-book"></i><span>Produtos</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="FrenteCaixa.jsp"><i class="fa fa-circle-o"></i> Listar Produtos</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-edit"></i><span>Cadastros</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="/view/cadastros/FormularioCadastroProduto.jsp"><i class="fa fa-circle-o"></i> Cadastro Produto</a></li>
                <li><a href="form-components.html"><i class="fa fa-circle-o"></i> Form Components</a></li>
                <li><a href="form-custom.html"><i class="fa fa-circle-o"></i> Custom Components</a></li>
                <li><a href="form-samples.html"><i class="fa fa-circle-o"></i> Form Samples</a></li>
                <li><a href="form-notifications.html"><i class="fa fa-circle-o"></i> Form Notifications</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-laptop"></i><span>UI Elements</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="bootstrap-components.html"><i class="fa fa-circle-o"></i> Bootstrap Elements</a></li>
                <li><a href="ui-font-awesome.html"><i class="fa fa-circle-o"></i> Font Icons</a></li>
                <li><a href="ui-cards.html"><i class="fa fa-circle-o"></i> Cards</a></li>
                <li><a href="widgets.html"><i class="fa fa-circle-o"></i> Widgets</a></li>
              </ul>
            </li>
            <li><a href="charts.html"><i class="fa fa-pie-chart"></i><span>Charts</span></a></li>
           
            <li class="treeview"><a href="#"><i class="fa fa-th-list"></i><span>Tables</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="table-basic.html"><i class="fa fa-circle-o"></i> Basic Tables</a></li>
                <li><a href="table-data-table.html"><i class="fa fa-circle-o"></i> Data Tables</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-file-text"></i><span>Pages</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="blank-page.html"><i class="fa fa-circle-o"></i> Blank Page</a></li>
                <li><a href="page-login.html"><i class="fa fa-circle-o"></i> Login Page</a></li>
                <li><a href="page-lockscreen.html"><i class="fa fa-circle-o"></i> Lockscreen Page</a></li>
                <li><a href="page-user.html"><i class="fa fa-circle-o"></i> User Page</a></li>
                <li><a href="page-invoice.html"><i class="fa fa-circle-o"></i> Invoice Page</a></li>
                <li><a href="page-calendar.html"><i class="fa fa-circle-o"></i> Calendar Page</a></li>
                <li><a href="page-mailbox.html"><i class="fa fa-circle-o"></i> Mailbox</a></li>
                <li><a href="page-error.html"><i class="fa fa-circle-o"></i> Error Page</a></li>
              </ul>
            </li>
            <li class="treeview"><a href="#"><i class="fa fa-share"></i><span>Multilevel Menu</span><i class="fa fa-angle-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="blank-page.html"><i class="fa fa-circle-o"></i> Level One</a></li>
                <li class="treeview"><a href="#"><i class="fa fa-circle-o"></i><span> Level One</span><i class="fa fa-angle-right"></i></a>
                  <ul class="treeview-menu">
                    <li><a href="blank-page.html"><i class="fa fa-circle-o"></i> Level Two</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i><span> Level Two</span></a></li>
                  </ul>
                </li>
              </ul>
            </li>
          </ul>
        </section>
      </aside>
      <div class="content-wrapper">
        <div class="page-title">
          <div>
            <h1><i class="fa fa-edit"></i>Frente Caixa</h1>
            <p>Caixa</p>
          </div>
          <div>
            <ul class="breadcrumb">
              <li><i class="fa fa-home fa-lg"></i></li>
              <li>Venda</li>
              <li><a href="#">Frente Caixa</a></li>
            </ul>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <div class="card">
               ${mensagem}
              <h3 class="card-title">Dados Produto</h3>
              <div class="card-body">
               <form>
                  <div class="form-group">
                    <label class="control-label">Produto:</label>
                    <input class="form-control" id="titulo-produto" name="produto">
                  </div>
                  <div class="form-group">
                   <button type="button" id="btn-buscar" name="btn_buscar" class="btn btn-primary">Buscar</button>
                  </div>
                  <div class="form-group">
                    <label class="control-label">Descrição Produto:</label>
                    <textarea class="form-control" id="descricaoProduto" name= "descricaoProduto" rows="4"></textarea>
                  </div>
                  <div class="form-group">
                    <label class="control-label">Valor Unitario:</label>
                    <input class="form-control" id="valorUnitario" name="valorUnitario">
                  </div>
                  <div class="form-group">
                    <label class="control-label">Quantidade:</label>
                    <input class="form-control" id="quantidade" name="quantidade">
                  </div>
                  <div class="form-group">
                    <label class="control-label">Valor Desconto:</label>
                    <div class="input-group"><span class="input-group-addon">%</span>
                		<input class="form-control" id="valorDesconto" name="valorDesconto" type="text">
                		<span class="input-group-btn">
                		<button class="btn btn-primary" id="btn-desconto" type="button">Aplicar</button></span>
             		</div>
                  </div>

                  <div class="form-group">
                    <label class="control-label">Valor Total:</label>
                    <input class="form-control" id="valorTotal" name="valorTotal">
                  </div>
                  <div class="form-group">
                    <button class="btn btn-primary" id="btn-add" type="button">Adicionar ao carrinho<span class="fa fa-cart-plus"></span></button>
                  </div>
                </form>
              </div>
            </div>
          </div>
          
          <div class="col-md-5">
            <div class="card">
              <h3 class="card-title">Resumo Venda</h3>
              <div class="card-body">
              <table id="tabela-produtos" class="table table-condensed">
                <thead>
                  <tr>
                    <th>Item</th>
                    <th>Quantidade</th>
                    <th>Valor</th>
                    <th>Valor Total</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach items="${produtos}" var="produto">
                  <tr>
                  	<td>${produto.getTitulo()}</td>
                  	<td>1</td>
                  	<td>${produto.getValor()}</td>
                  	<td>${produto.getValor() * 3}</td>
                  </tr>
                  </c:forEach>       
                </tbody>
              </table>
              </div>
            </div>
          </div>
          <div class="col-md-5">
            <div class="card">
              <div class="card-body">
         		 <div class="form-group">
          		 <label class="control-label">Total da venda</label>
             	 <div class="input-group"><span class="input-group-addon">R$</span>
                	<input class="form-control" type="text"><span class="input-group-btn">
                	<button class="btn btn-primary" type="button">Finalizar</button></span>
             	 </div>
        		 </div> 
         	 </div>
          </div>
         </div>
		</div>
	</div>
	</div>
  </body>
</html>