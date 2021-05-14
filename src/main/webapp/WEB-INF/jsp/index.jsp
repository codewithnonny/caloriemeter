<html>
<head>
<title>Calorie Meter </title>
<style>
.container{
    width:30%;
    margin:auto;
    background-color: aliceblue;
}
body{
font-size:30px
}
</style>
</head>
    <body>
    <h1 class="container">Registration</h1>
            <div class="container" >
                    <form action="user/register" method="post" >
                            <table>
                                <tr>
                                    <td>Enter Your Name</td>
                                    <td> <input type="text" name="username" /> </td>
                                </tr>
                                <tr>
                                    <td>Enter Your Age</td>
                                    <td> <input type="text" name="age" /> </td>
                                </tr>
                                <tr>
                                    <td>Enter Your Weight</td>
                                    <td> <input type="text" name="weight" /> </td>
                                </tr>
                            </table>
                            <button type="submit">submit</button>
                    </form>
            </div>
    </body>
</html>
