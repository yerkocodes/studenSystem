<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Estudiantes</title>
<%@ include file="../layouts/headCDN.html"%>
</head>
<body>

	<main>

		<div class="container mx-auto my-5 py-5">
			<form:form class="row" method="POST" action="/filtroEstudiante" modelAttribute="employee">
				<!-- REGIONES -->
				<div class="mb-3 col-4">
					<select name="region" class="form-select" aria-label="Default select example" required>
						<option selected disabled>Elija una region</option>
						<c:forEach var="region" items="${regiones}">
							<option value="${region.getCodigo_region()}"> <c:out value="${region.getNombre()}"></c:out> </option>
						</c:forEach>
					</select>
				</div>

				<!-- ELIJA CURSO -->
				<div class="mb-3 col-4">
					<select name="curso" class="form-select" aria-label="Default select example" required>
						<option selected disabled>Elija un curso</option>
						<c:forEach var="curso" items="${cursos}">
							<option value="${curso.getCodigo_plan_formativo()}"> <c:out value="${curso.getDescripcion()}"></c:out> </option>
						</c:forEach>
					</select>
				</div>

				<div class="col-4">
					<button type="submit" class="btn btn-primary">Filtrar</button>
				</div>

			</form:form>
		</div>

		<div class="container mx-auto">
			<table class="table mx-auto">
				<thead>
					<tr>
						<th scope="col">Rut</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido Paterno</th>
						<th scope="col">Apellido Materno</th>
						<th scope="col">Codigo Curso</th>
						<th scope="col">Descripcion Curso</th>
					</tr>
				</thead>
				<tbody>

 				<c:forEach var="e" items="${estudiantes}">
					<tr>
						<th scope="row"> <c:out value="${e.getRut()}"></c:out> </th>
						<td> <c:out value="${e.getNombre()}"> </c:out></td>
						<td> <c:out value="${e.getApellido_pat()}"></c:out> </td>
						<td> <c:out value="${e.getApellido_mat()}"></c:out> </td>
						<td> <c:out value="${e.getCurso().getCodigo_curso()}"></c:out> </td>
						<td> <c:out value="${e.getCurso().getPlanFormativo().getDescripcion()}"></c:out> </td>
					</tr>
				</c:forEach>

		</tbody>
			</table>
		</div>

	</main>

</body>
</html>