# MondaySpringProject

Each developer should use the SQL below to update the Sakila 
database with the new table USER.
```SQL
Use sakila;

drop table user;

Create table user(
  user_id int not null auto_increment primary key,
  user_name varchar(50) not null unique,
  user_email varchar(50) not null,
  user_password varchar(50) not null,
  user_key varchar(36),
  last_update timestamp);
  
Insert into user(
  user_name,
  user_email,
  user_password)
  values('elza', 'econtiero@spartaglobal.com' , '12345');
  
Insert into user(
  user_name,
   user_email,
  user_password)
  values('cathy', 'cfrench@spartaglobal.com' , 'abcde');
  
Insert into user(
  user_name,
  user_email,
  user_password)
  values('laura', 'ltozer@spartaglobal.com', 'fghij');
  
  Insert into user(
  user_name,
  user_email,
  user_password)
  values('mary', 'mgeorge@spartaglobal.com', 'klmno');
  
   Insert into user(
  user_name,
  user_email,
  user_password)
  values('nicole', 'nakanbi@spartaglobal.com', 'pqrst');
```
