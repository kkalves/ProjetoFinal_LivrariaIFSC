$(document).ready(function() {
	$("#btn-buscar").click(function() {
	   $.ajax("http://localhost:8080/ProjetoFinal_Livraria/buscaProduto?titulo=123")
	   .done(function(data){
			   console.log(data);
	   })
	   .fail(function(){
		   alert("deu ruim!");
	   })
	});
});
