<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/jquery.mobile-1.4.5.css">
<script src="js/jquery.js"></script>
<script src="js/jquery.mobile-1.4.5.js"></script>
<script src="js/login.js"></script>
<style>

.img-container img {
   margin: 2% 0 0 45%;
    width: 100px;
    <!--border: 3px solid green;-->
    padding: 10px;
}
#data_content {
    width: auto;
    height: auto;
    box-shadow: 10px 10px 5px #888888;
}
html { 
  background: url(images/bg.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

</style>
</head>
<body src="images/login-bg.png">
<!--Header Content-->

    <div class="img-container">
        <img src="images/logo.png" alt="" />
    </div>
	
<div data-role="content" style="width:800px; margin:5% auto;background:#E7DFDD;" id="data_content">

		<div data-role="tabs" id="tabs">
		  <div data-role="navbar" data-theme="b"  >
			<ul>
			  <li data-icon="grid"><a href="#login_tab" data-ajax="false" data-icon="user" >LOGIN</a></li>
			  <li><a href="#signup_tab" data-ajax="false" data-icon="plus">SIGN UP</a></li>
			</ul>
		  </div>
  		  <div id ="error" style="color:#999999; font-size:18px"><center>Enter Valid Username/Password</center></div>
		  <div id ="error1" style="color:#999999; font-size:18px"><center>Invalid Username/Password</center></div>
		  <div id="login_tab" class="ui-body-d ui-content" data-icon="grid">
					   <div data-role="main" class="ui-content">
						  <div class="ui-field-contain">				   
							<input type="text"  id="userName" placeholder="Username">   
							<input type="text"  id="userPassword" placeholder="Password"> 	
							
						  </div>
						 <!-- <a href="index.html" data-role="button" data-theme="b" data-rel="popup">LOGIN</a> -->
						 <input type="submit" id="login-button" name="Login" value="Login" />				 
					</div>	
		  </div>
		  <!--Sign upContent-->
		  <div id="signup_tab">
		  <form>
			<div data-role="main" class="ui-content">
						    <div class="ui-field-contain">				   
							<input type="text"  id="username" placeholder="Username"> 
							<input type="text"  id="password" placeholder="Password">
							<input type="text"  id="firstname" placeholder="First Name"> 
							<input type="text"  id="lastname" placeholder="Last Name">
							<input type="text"  id="email" placeholder="Email">
							<input type="text"  id="country" placeholder="Country">
							<input type="text"  id="state" placeholder="State">
							<input type="text"  id="zipCode" placeholder="Zipcode">
						    </div>
						 <!-- <a href="index.html" data-role="button" data-theme="b">SIGN UP</a> -->
                         <input type="submit" id="signup-button" name="Sign Up" value="Sign Up" />	
			 </div>		  	  
			</form>
		</div>
</div>

</body>
</html>