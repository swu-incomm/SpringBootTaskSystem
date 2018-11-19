<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>Task Management | Home</title>
        <link href="static/css/bootstrap.min.css" rel="stylesheet">
        <link href="static/css/style.css" rel="stylesheet">
    </head>
    <body> 
                <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#">WebSiteName</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="#">Sobin</a></li>
                            <li><a href="#">Manage Tasks</a></li>
                            <li><a href="#">All Tasks</a></li>
                        </ul>
                    </div>
                </nav>
                <div class="container invisible-at-first" id="homeDiv">
                    <div class="jumbotron text-center">
                        <h3>Tasks management system</h3>
                    </div>
                </div>
                <div class="container text-center" id="taskDiv">
                    <h3>My Tasks</h3>
                    <hr>
                    <div class="table-response">
                        <table class="table table-striped table-borded">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Description</th>
                                    <th>Date Created</th>
                                    <th>Finished</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="task" items="${tasks}">
                                    <tr>
                                        <td>${task.id}</td>
                                        <td>${task.name}</td>
                                        <td>${task.description}</td>
                                        <td>${task.dateCreated}</td>
                                        <td>${task.finished}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            <script src="static/js/bootstrap.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </body>  
</html>