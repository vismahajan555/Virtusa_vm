<?php
		$conn = new mysqli('localhost', 'root', 'Latika@0101', 'atmdb');

		if($conn == false){
			die("ERROR : Could not connect. " . mysql_connect_error());
		}
?>