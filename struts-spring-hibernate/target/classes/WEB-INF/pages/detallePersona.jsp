<%@ include file="taglibs.jsp"%>
<title>Detalle Persona</title>
<p>Detalle de la Persona:</p>

<html:form action="/guardar" focus="persona.nombre">

	<!-- onsubmit="return validateUserForm(this)"> -->
	<input type="hidden" name="metodo" value="accionGuardar" />
	<html:hidden property="persona.idPersona" />
	<table>
		<tr>
			<th><bean:message key="persona.nombre" />:</th>
			<td><html:text property="persona.nombre" /></td>
		</tr>
		<tr>
			<th><bean:message key="persona.apePaterno" />:</th>
			<td><html:text property="persona.apePaterno" /></td>
		</tr>
		<tr>
			<th><bean:message key="persona.email" />:</th>
			<td><html:text property="persona.email" /></td>
		</tr>
		<tr>
			<td><html:submit styleClass="button">Guardar</html:submit> <c:if
					test="${not empty param.idPersona}">
					<html:submit styleClass="button"
						onclick="this.form.metodo.value='accionEliminar'">Eliminar</html:submit>
				</c:if></td>
		</tr>
	</table>
</html:form>