<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catálogo de Produto</title>
<script src="ProjetosUnicredWeb/ProjetoWebInicial/assets/jquery-3.3.1.js"></script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Código</td>
				<td>Produto</td>
				<td>Fabricante</td>
				<td>Valor</td>
			</tr>
			<tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	
	<script type="text/javascript">
            $(document).ready(function(){
                var items = [
                    { Name: "Apple", Price: "80", Quantity : "3", Total : "240" },
                    { Name: "Orance", Price: "50", Quantity : "4", Total : "200" },
                    { Name: "Banana", Price: "20", Quantity : "8", Total : "160" },
                    { Name: "Cherry", Price: "250", Quantity : "10", Total : "2500" }
                ];

                $( "#itemTemplate" ).tmpl( items ).appendTo( "#itemList tbody" );
            });
        </script>
        
        
</body>
</html>