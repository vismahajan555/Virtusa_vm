<?php
    session_start();
    include 'dbcon.php';
  
    if(isset($_SESSION["accno"])){

      if (isset($_POST["btnChangePin"])) {
        $npin = $_POST["npin"];
        $cpin = $_POST["cpin"];
      
        if($npin==$cpin){
          $sql_changepin = "UPDATE atm SET pin = '".$cpin."' WHERE accountno = '".$_SESSION['accno']."'";
 
          if(mysqli_query($conn, $sql_changepin)){
            echo "<script type='text/javascript'> alert('PIN Changed Successfully !')</script>";
          } 
        }
        else{
           echo "<script type='text/javascript'> alert('Confirm password doesn\'t matched ! Try Again !')</script>";
        }
      }
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
    <title>Change PIN</title>
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
        <h1 class="title">Change PIN</h1>
      </div>

      
      <form id="form" method="post">

      <div class="form-control">
          <div class="input-base">
            <input type="password" minlength="4" maxlength="4" placeholder="New PIN" name="npin" class="input input__password" required />
            <label class="label label__passwords" for="password">New PIN*</label>
            <fieldset>
              <legend>
                <span>New PIN*</span>
              </legend>
            </fieldset>
          </div>
        </div>
        

        <div class="form-control">
          <div class="input-base">
            <input type="password" minlength="4" maxlength="4" placeholder="Confirm PIN"  name = "cpin" class="input input__password" required />
            <label class="label label__passwords" for="password">Confirm PIN*</label>
            <fieldset>
              <legend>
                <span>Confirm PIN*</span>
              </legend>
            </fieldset>
          </div>
        </div>

        
        <div class="actions-buttons">
          <button name="btnChangePin" type="submit" class="btn">
            <span class="btn__text">Change PIN</span>
            <div class="loader">
              <div class="cir"></div>
              <div class="cir"></div>
              <div class="cir"></div>
            </div>
          </button>
        </div>

        <br>
        <a class="btn btn-primary actions-buttons" href="menu.php">Back</a>
        
      </form>
    </div>
  </div>
</div>
</body>
</html>