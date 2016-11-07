<%@ include file="taglibs.jsp"%>
<title>Listado de Personas</title>
<a href="detalle.do?metodo=accionAgregar">Agregar Persona</a>
<br />
<table border="1">
	<thead>
		<tr>
			<th><bean:message key="persona.idPersona" /></th>
			<th><bean:message key="persona.nombre" /></th>
			<th><bean:message key="persona.apePaterno" /></th>
			<th><bean:message key="persona.email" /></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="persona" items="${personas}">
			<tr>
				<td><a
					href="detalle.do?metodo=accionEditar&idPersona=${persona.idPersona}">${persona.idPersona}</a></td>
				<td>${persona.nombre}</td>
				<td>${persona.apePaterno}</td>
				<td>${persona.email}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>