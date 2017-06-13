<!DOCTYPE htm<!DOCTYPE html>
<html>
  <head>
  
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- CSS-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <title>Greenwich Village </title>
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
      <header class="main-header hidden-print"><a class="logo" href="index.html">Greenwich Village </a>
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
              <p> </p>
              <p class="designation"></p>
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
               <li><a href="/ProjetoFinal_Livraria/CadastroClienteFisico"><i class="fa fa-circle-o"></i> Cadastro Cliente Fisico</a></li>
                <li><a href="/ProjetoFinal_Livraria/CadastroClienteJuridico"><i class="fa fa-circle-o"></i> Cadastro Cliente Juridico</a></li>
                <li><a href="ProjetoFinal_Livraria/CadastroVendedor"><i class="fa fa-circle-o"></i> Cadastro Vendedor</a></li>
     
              </ul>
            </li>
          </ul>
        </section>
      </aside>
      <div class="content-wrapper">
        <div class="page-title">
          <div>
                  <h1><i class="fa fa-edit"></i>Cadastro Cliente Juridico</h1>
            <p></p>
          </div>
          <div>
            <ul class="breadcrumb">
              <li><i class="fa fa-home fa-lg"></i></li>
              <li>Formulario</li>
              <li><a href="#">Cadastro Cliente Juridico</a></li>
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
                    <label class="control-label">Nome completo</label>
                    <input class="form-control" name="nome" placeholder="Digite o nome do cliente ">
                  </div>
                  <div class="form-group">
                    <label class="control-label">Email</label>
                    <input class="form-control" name="email" placeholder="Email do cliente">
                  </div>
                  <div class="controls">
                  <label for="sexo">Sexo:</label><br />
                     <input type="radio" name="sexo" value="masculino"/> Masculino<br />
                  <input type="radio" name="sexo" value="feminino"/> Feminino<br />
                  </div>
                  <br>
                  <div class="form-group">
                    <label class="control-label">Cnpj</label>
                    <input class="form-control" name="cnpj" placeholder="Cnpj do cliente">
                  </div>
                  <div class="form-group">
                    <label class="control-label">Endere�o</label>
                    <input class="form-control" name="endere�o" placeholder="Endere�o do cliente">
                  </div>
                  <div class="form-group">
                    <label class="control-label">Bairro</label>
                    <input class="form-control" name="bairro" placeholder="Bairro do cliente">
                  </div>
                  <div class="form-group">
                    <label class="control-label">Telefone</label>
                    <input class="form-control" name="telefone" placeholder="Telefone do cliente">
                  </div>
                   <div class="form-group">
                    <label class="control-label">Cidade</label>
                    <input class="form-control" name="cidade" placeholder="Cidade do cliente">
                  </div>
                   <div class="form-group">
                    <label class="control-label">Estado</label>
                    <input class="form-control" name="estado" placeholder="Estado do cliente">
                  </div>
                </form>
              </div>
              <div class="card-footer">
               <input class="btn btn-primary icon-btn" type="submit" value="Cadastrar"></div>
            </div>
  </body>
 </html>