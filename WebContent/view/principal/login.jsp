<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- CSS-->
	<link rel="stylesheet" type="text/css" href="../../css/main.css">
	<title>Greenwich Village</title>
	<!-- Javascripts-->
	<script src="../../js/jquery-2.1.4.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/plugins/pace.min.js"></script>
    <script src="../../js/main.js"></script>
</head>
<body>
	<section class="material-half-bg">
		<div class="cover"></div>
    </section>
    <section class="login-content">
      <div class="logo">
      	<!-- div class="pull-center image"><img class="img-responsive" src="../../images/Logo.png"></div-->
        <h1>Greenwich Village </h1>
      </div>
      <div class="login-box">
        <form class="login-form" action="index.html">
          <h3 class="login-head"><i class="fa fa-lg fa-fw fa-user"></i>Login</h3>
          <div class="form-group">
            <label class="control-label">Email</label>
            <input class="form-control" type="text" placeholder="Email" autofocus>
          </div>
          <div class="form-group">
            <label class="control-label">Senha</label>
            <input class="form-control" type="password" placeholder="senha">
          </div>
          <div class="form-group"></div>
          <div class="form-group btn-container">
            <button class="btn btn-primary btn-block" id="bt-acessar">Entrar<i class="fa fa-sign-in fa-lg"></i></button>
          </div>
        </form>
        <form class="forget-form" action="index.html">
          <h3 class="login-head"><i class="fa fa-lg fa-fw fa-lock"></i>Esqueceu Sua Senha ?</h3>
          <div class="form-group">
            <label class="control-label">Email</label>
            <input class="form-control" type="text" placeholder="Email">
          </div>
          <div class="form-group btn-container">
            <button class="btn btn-primary btn-block">Sair<i class="fa fa-unlock fa-lg"></i></button>
          </div>
          <div class="form-group mt-20">
            <p class="semibold-text mb-0"><a data-toggle="flip"><i class="fa fa-angle-left fa-fw"></i> Voltar ao Login</a></p>
          </div>
        </form>
      </div>
    </section>
</body>
</html>