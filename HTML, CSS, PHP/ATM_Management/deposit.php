<?php
    session_start();
    include 'dbcon.php';
  
    if(isset($_SESSION["accno"])){
      //echo $_SESSION["accno"];

      if (isset($_POST["btnDeposit"])) {
      $amt = $_POST["amt"];
      
      $sql_deposit = "UPDATE atm SET balance = balance +$amt WHERE accountno = '".$_SESSION['accno']."'";
      
      if(mysqli_query($conn, $sql_deposit)){
        echo "<script type='text/javascript'> alert('Transaction Successful !')</script>";
      }
      else{

        echo "<script type='text/javascript'> alert('Transaction Failed !')</script>";
      }

      mysqli_close($conn);
    }
  }
    
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href = "login.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deposit</title>
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
        <h1 class="title">Deposit</h1>
      </div>

      
      <form id="form" method="post">
        <div class="form-control">
          <label id = "acc" style="font-weight: 500; font-size: large;">Account Number : <?php echo $_SESSION["accno"]; ?></label><br><br>
          <div class="input-base">
            <input type="number" minlength="4" maxlength="12" placeholder="Amount" name="amt" class="input input__email" required />
            <label class="label label__email" for="email">Amount*</label>
            <fieldset>
              <legend>
                <span>Amount*</span>
              </legend>
            </fieldset>
          </div>
        </div>
        
        <div class="actions-buttons">
          <button name="btnDeposit" type="submit" class="btn">
            <span class="btn__text">Deposit</span>
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