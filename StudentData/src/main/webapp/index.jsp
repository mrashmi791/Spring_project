
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<div align="center">
		<h1>Student Records</h1>
		<form method="post" action="search">

			<input type="text" name="keyword" /> <input type="submit"
				value="search" />

		</form>
		
		<h3><a href="new">New Student</a></h3>
		<table border="1" style="padding:3px">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>E-mail</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
			<c:if test="${listStudent }">
				<c:forEach items="${listStudent }" var="customer">
					<tr>

						<td>${student.id }</td>
						<td>${student.name }</td>
						<td>${student.email }</td>
						<td>${student.address }</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</body>
</html>
