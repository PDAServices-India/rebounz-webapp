CREATE TABLE user (
  USER_ID integer identity NOT NULL,
  USERNAME varchar(15) NOT NULL,
  PASSWORD_HASH varchar(80) NOT NULL,
  SALT varchar(40) NOT NULL,
  FIRSTNAME varchar(30) NOT NULL,
  LASTNAME varchar(30) NOT NULL,
  STATUS varchar(8),
  PRIMARY KEY (USER_ID),
  UNIQUE (USERNAME)
);

GRANT select ON user TO public;
GRANT all ON user TO sa;
