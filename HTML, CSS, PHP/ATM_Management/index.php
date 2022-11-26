<?php
    session_start();
    include 'dbcon.php';
    if (isset($_POST["btnLogin"])) {
      $accno = $_POST["accno"];
      $pin = $_POST["password"];

      $sql_login = "SELECT * from atm where accountno='$accno' and pin=$pin";

      $result = mysqli_query($conn, $sql_login);  
      $row = mysqli_fetch_array($result, MYSQLI_ASSOC);  
      $count = mysqli_num_rows($result);  
          
        if($count == 1){  
            echo "<script type='text/javascript'> alert('Login Successful !')</script>";
            header('location:menu.php');
            
            $_SESSION["accno"] = $accno;
        }  
        else{  
             
            echo "<script type='text/javascript'> alert('Invalid Credentials !!! ')</script>";
        }

      mysqli_close($conn);
    }
    
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href = "login.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
        <h1 class="title">Login</h1>
      </div>

      
      <form id="form" method="post">
        <div class="form-control">
          <div class="input-base">
            <input type="number" minlength="12" maxlength="12" placeholder="Account Number" name="accno" class="input input__email" required />
            <label class="label label__email" for="email">Account Number*</label>
            <fieldset>
              <legend>
                <span>Account Number*</span>
              </legend>
            </fieldset>
          </div>
        </div>
        <div class="form-control">
          <div class="input-base">
            <input type="password" minlength="4" maxlength="4" placeholder="PIN" name="password" class="input input__password" required />
            <label class="label label__passwords" for="password">PIN*</label>
            <fieldset>
              <legend>
                <span>PIN*</span>
              </legend>
            </fieldset>
          </div>
        </div>

        
        <div class="actions-buttons">
          <button name="btnLogin" type="submit" class="btn">
            <span class="btn__text">Login</span>
            <div class="loader">
              <div class="cir"></div>
              <div class="cir"></div>
              <div class="cir"></div>
            </div>
          </button>
        </div>
        
        <center><p class="subtitle"><br>
        Create New Account -
        <u><a class="link login-anchor" href="signup.php">Sign Up</a></u>
        </p>
        </center>
      </form>
    </div>
  </div>
</div>
</body>
</html>