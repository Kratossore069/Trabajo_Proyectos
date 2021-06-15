<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pruebas de mvc</title>
</head>
<body>
    <?php
    require_once './controlador/SaludoControlador.php';
    $saludo=new SaludoControlador();
    echo "<h1>".$saludo->saludoNombre("Víctor")."</h1>";
    ?>
</body>
</html>