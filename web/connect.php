<?php

	$connect_error = 'Sorry, we\'re experienceing connection problems';
	$host = "mysql9.000webhost.com";
	$database = "a2093817_events";
	$user = "a2093817_sankalp";
	$password = "root123";

	mysql_connect($host, $user, $password) or die($connect_error);
	mysql_select_db($database) or die($connect_error);
	
?>
