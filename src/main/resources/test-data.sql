--The password hash is generated for the password - "Password123#"

INSERT INTO user (`USERNAME`, `PASSWORD_HASH`, `SALT`, `FIRSTNAME`, `LASTNAME`, `STATUS` , `PASSWORD`, `EMAIL`, `COUNTRY`, `STATE`, `ZIPCODE`) 
VALUES ('pradeeppg89', 'sRmdRrXbCOxH/3E5URhm3iAjQGYN6yXmyJc2d2sLxxs=', 'edI27iUn9eKlAuc770eHsA==', 'Pradeep', 'Prabhakaran', 'INACTIVE', 'welcome', 'pradeeppg89@gmail.com', 'INDIA', 'TN', '6000052');

INSERT INTO user (`USERNAME`, `PASSWORD_HASH`, `SALT`, `FIRSTNAME`, `LASTNAME`, `STATUS` , `PASSWORD`, `EMAIL`, `COUNTRY`, `STATE`, `ZIPCODE`) 
VALUES ('manoj.pda', 'sRmdRrXbCOxH/3E5URhm3iAjQGYN6yXmyJc2d2sLxxs=', 'edI27iUn9eKlAuc770eHsA==', 'Manojsundar', 'Gunasekaran', 'INACTIVE', 'welcome', 'manojsundarg.pda@gmail.com', 'INDIA', 'TN', '6000043');

INSERT INTO usr_acc_details (`CARDHOLDERNAME`, `CARDNUMBER`, `PAYEMENTMODE`, `PAYEMENTTYPE`, `EXPIREMONTH`, `EXPIREYEAR` , `username`) 
VALUES ('PRADEEP', '4321090987671212', 'DEBIT CARD', 'VISA', '11', '22', 'pradeeppg89');