# MondaySpringProject

In this API project we have created methods that create, read and update films and rentals by their ID.

To use these methods, please use the following end points. 

Read films endpoint: springProject/api/films/getFilms/{Id}

Create films endpoint: springProject/api/films/postFilm

To create a new film, data needs to be in the below format and the special features can only include "Behind the Scenes, Trailers, Commentaries, Deleted Scenes". If you want to add multiple special feature tags, they must be seperated by a comma with no space.
(example in json) 
```json

{
    "title": "Lorem ipsum",
    "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
    "languageId": 1,
    "releaseYear": 2023,
    "rentalDuration": 5,
    "rentalRate": 4.99,
    "length": 91,
    "replacementCost": 16.99,
    "rating": "PG",
    "specialFeatures": "Behind the Scenes,Commentaries"
}

```


---

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
