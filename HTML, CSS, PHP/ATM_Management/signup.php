<?php
    include 'dbcon.php';
    if (isset($_POST["btnSignUp"])) {
      $accno = $_POST["accno"];
      $name = $_POST["name"];
      $addr = $_POST["addr"];
      $pin = $_POST["password"];
      $phone = $_POST["phone"];

      $sql_signup = "INSERT INTO atm (`name`, `accountno`, `address`, `pin`, `phoneno`,`balance`) VALUES ('$name', '$accno', '$addr', '$pin', '$phone',0)";

      if(mysqli_query($conn, $sql_signup)){
        echo "<script type='text/javascript'> alert('Registration Successful !')</script>";
      }
      else{
        echo "<h3>Error !!</h3>";
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
    <title>Sign Up</title>
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
        <h1 class="title">Sign Up</h1>
      </div>

      
      <form id="form" method="post">
        <div class="form-control">
          <div class="input-base">
            <input type="number" minlength="12" maxlength="12" placeholder="Account Number" name="accno" class="input input__password" pattern="\d{12}" required/>
            <label class="label label__passwords" for="email">Account Number*</label>
            <fieldset>
              <legend>
                <span>Account Number*</span>
              </legend>
            </fieldset> 
          </div>
        </div>

        <div class="form-control">
          <div class="input-base">
            <input type="text" placeholder="Name" name="name" class="input input__email" required />
            <label class="label label__email" for="name">Name*</label>
            <fieldset>
              <legend>
                <span>Name*</span>
              </legend>
            </fieldset> 
          </div>
        </div>

        <div class="form-control">
          <div class="input-base">
            <textarea cols = "10" rows = "4" placeholder = "Address" class="input input__email" name = "addr" required></textarea>
            <label class="label label__email" for="address">Address*</label>
            <fieldset>
              <legend>
                <span>Address*</span>
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

        <div class="form-control">
          <div class="input-base">
            <input type="number" minlength="10" maxlength="10" placeholder="Phone Number" name="phone" class="input input__email" required />
            <label class="label label__email" for="phone">Phone Number*</label>
            <fieldset>
              <legend>
                <span>Phone Number*</span>
              </legend>
            </fieldset> 
          </div>
        </div>

        
        <div class="actions-buttons">
          <button name="btnSignUp" type="submit" class="btn">
            <span class="btn__text">Create Account</span>
            <div class="loader">
              <div class="cir"></div>
              <div class="cir"></div>
              <div class="cir"></div>
            </div>
          </button>
        </div>
        
        <center><p class="subtitle"><br>
        Already Have Account -
        <u><a class="link login-anchor" href="index.php">Login</a></u>
        </p>
        </center>
      </form>
    </div>
  </div>
</div>
</body>
</html>