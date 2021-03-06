<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container" style="margin-top: 50px; margin-bottom: 50px; width: 1000px;">
    <div class="container">

        <table class="table table-striped bg-light">
            <thead>
                <tr class="text-center">
                    <th>Data</th>
                    <th>Tema</th>
                    <th>Professor</th>
                    <th>Quantidade Alunos</th>
                </tr>
            </thead>

            <tbody  id="tabela" class="text-center">
            <c:if test="${requestScope.teoricas.size() == 0}">
                    <tr>
                        <td colspan="4">  N�o h� Aulas Te�ricas Cadastrados </td>
                    </tr>
                </c:if>
                <c:forEach items="${requestScope.teoricas}" var="m">
                    <tr>
                        <td>${m.dataAulaToString()}</td>
                        <td>${m.tema}</td>
                        <td>${m.professorId.nome}</td>
                        <td>${m.alunoList.size()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </div>
</div>

