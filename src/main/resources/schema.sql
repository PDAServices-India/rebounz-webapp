CREATE TABLE user (
  USER_ID integer identity NOT NULL,
  USERNAME varchar(15) NOT NULL,
  PASSWORD_HASH varchar(80),
  SALT varchar(40),
  FIRSTNAME varchar(30) NOT NULL,
  LASTNAME varchar(30) NOT NULL,
  STATUS varchar(8),
  PASSWORD varchar(25) NOT NULL,
  EMAIL varchar(30),
  COUNTRY varchar(30),
  STATE varchar(30),
  ZIPCODE varchar(10),
  PRIMARY KEY (USER_ID),
  UNIQUE (USERNAME),
  UNIQUE (EMAIL)
);

GRANT select ON user TO public;
GRANT all ON user TO sa;

CREATE TABLE usr_acc_details (
  ID integer identity NOT NULL,
  USER_ID integer,
  USERNAME varchar(15),
  CARDHOLDERNAME varchar(30),
  CARDNUMBER varchar(30),
  PAYEMENTMODE varchar(15),
  PAYEMENTTYPE varchar(15),
  EXPIREMONTH varchar(2),
  EXPIREYEAR varchar(2),
  FOREIGN KEY (USER_ID) REFERENCES user(USER_ID),
  FOREIGN KEY (USERNAME) REFERENCES user(USERNAME),
  UNIQUE (USERNAME)
);

GRANT select ON usr_acc_details TO public;
GRANT all ON usr_acc_details TO sa;