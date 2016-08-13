$(document).ready(function() {
$("#error1").hide();
$("#error").hide();
    $('#login-button').on('click', function(){
	$("#error1").hide();
    $("#error").hide();
		  var userName =  $("#userName").val();
    	  var password =  $("#userPassword").val();
		  if(userName!='' && password!=''){;
		  $.ajax({
                  type : "POST",
                  url : "rest/login/validateLogin",
                  data:"username="+userName+"&password="+password,
                  dataType : "json",
                  success : function(response) {
                	   console.log(response.firstname+""+response.lastname);
                  },
                  error : function() {
						  $("#error1").show();
                  }
            }); 
		  }else{
		   $("#error").show();
		  }			
    });
	
$('#signup-button').on('click', function(){
                 var username = $("#username").val();
				 var userpassword = $("#password").val();
				 var firstname= $("#firstname").val();
				 var lastname = $("#lastname").val();
				 var email    = $("#email").val();
				 var country  = $("#country").val();
				 var state    = $("#state").val();
				 var zipCode  = $("#zipCode").val();
				 var signUpJsonarray = {
                  username:username,
				  password:userpassword,
				  firstname:firstname,
				  lastname :lastname,
				  email:email,
				  country:country,
				  state:state,
				  zipCode:zipCode
                  }
				    console.log(JSON.stringify(signUpJsonarray));
       $.ajax({
                  type : "POST",
                  url : "rest/login/userRegistration",
				  contentType: 'application/json',
				  data: JSON.stringify(signUpJsonarray),
                  dataType : "json",
                  success : function(response) {
                	   console.log("Enter here");
                  },
                  error : function() {
						  $("#error1").show();
                  }
            });
});
});