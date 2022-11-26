<?php
    session_start();
    include 'dbcon.php';
  
    if(isset($_SESSION["accno"])){
      //echo $_SESSION["accno"];
      $sql_getBal = "SELECT balance from atm where accountno = '".$_SESSION['accno']."'";

      $result = mysqli_query($conn, $sql_getBal);  
      $row = mysqli_fetch_array($result, MYSQLI_ASSOC);
  }
  mysqli_close($conn);   
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href = "login.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Balance</title>
</head>
<body>
    

<div class="container bg">
  <div class="form-wrapper">
    <div class="form-content">

      <div class="header">
        <div class="logo">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 121.56 121.56"><path fill="currentColor"d="M0,0V121.56H121.56V0ZM89.43,103.71a14.3,14.3,0,1,1,14.3-14.3A14.31,14.31,0,0,1,89.43,103.71Z"/></svg>
        
        </div>
        <div class="separator"></div>
        <h1 class="title">Balance</h1>
      </div>

      
      <form id="form" method = "post">
        <div class="form-control">
          <div class="form-control">
            <center>
          <label id = "acc" style="font-weight: 500; font-size: x-large;">Account Number : <?php echo $_SESSION["accno"]; ?></label><br>
          <label id = "currentAmt" style="font-weight: 500; font-size: x-large;">Current Amount : <?php echo $row["balance"]; ?></label><br><br>
          </center>
        </div>
        </div>
        
        <br>
        <a class="btn btn-primary actions-buttons" href="menu.php">Back</a>
      </form>
    </div>
  </div>
</div>
</body>
</html>