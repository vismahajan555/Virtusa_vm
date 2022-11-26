<?php
    session_start();
    include 'dbcon.php';
  
    if(isset($_SESSION["accno"])){
      //echo $_SESSION["accno"];
      $sql_getBal = "SELECT balance from atm where accountno = '".$_SESSION['accno']."'";

      $result = mysqli_query($conn, $sql_getBal);  
      $row = mysqli_fetch_array($result, MYSQLI_ASSOC);
      //echo $row["balance"];

      if (isset($_POST["btnWithdraw"])) {
      $amt = $_POST["amt"];
      
      if($row["balance"] < $amt){
        echo "<script type='text/javascript'> alert('Insufficient Balance !')</script>";
      }
      else{
      $sql_withdraw = "UPDATE atm SET balance = balance -$amt WHERE accountno = '".$_SESSION['accno']."'";
      
 
      if(mysqli_query($conn, $sql_withdraw)){
        echo "<script type='text/javascript'> alert('Transaction Successful !')</script>";

        $sql_getBal1 = "SELECT balance from atm where accountno = '".$_SESSION['accno']."'";

      $result1 = mysqli_query($conn, $sql_getBal1);  
      $row1 = mysqli_fetch_array($result1, MYSQLI_ASSOC);
        echo "<script type='text/javascript'> function myFun(){ var lbl = document.getElementById('currentAmt'); lbl.innerHTML = 'Current Balance: '+". $row1["balance"] . " }</script>";

      }
      else{
  
        echo "<script type='text/javascript'> alert('Transaction Failed !')</script>";
      }

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
    <title>Withdraw</title>
</head>
<body onload = "myFun()">
    

<div class="container bg">
  <div class="form-wrapper">
    <div class="form-content">

      <div class="header">
        <div class="logo">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 121.56 121.56"><path fill="currentColor"d="M0,0V121.56H121.56V0ZM89.43,103.71a14.3,14.3,0,1,1,14.3-14.3A14.31,14.31,0,0,1,89.43,103.71Z"/></svg>
        
        </div>
        <div class="separator"></div>
        <h1 class="title">Withdraw</h1>
      </div>

      
      <form id="form" method="post">

        <div class="form-control">
          <label id = "acc" style="font-weight: 500; font-size: large;">Account Number : <?php echo $_SESSION["accno"]; ?></label><br>
          <label id = "currentAmt" style="font-weight: 500; font-size: large;">Current Amount : <?php echo $row["balance"]; ?></label><br><br>
          <div class="input-base">
            <input type="number" minlength="4" maxlength="12" placeholder="Amount" name="amt" class="input input__email" required />
            <label class="label label__email" for="email">Amount to Withdraw*</label>
            <fieldset>
              <legend>
                <span>Amount to Withdraw*</span>
              </legend>
            </fieldset>
          </div>
        </div>

        
        <div class="actions-buttons">
          <button name="btnWithdraw" type="submit" class="btn" onClick="myFun()">
            <span class="btn__text">Withdraw</span>
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