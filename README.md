# MondaySpringProject

In this API project we have created methods that create, read, update and delete films and rental entries. To use these methods, please use the following end points;

### Films

Read films endpoint: GET: http://localhost:8080/springProject/api/films/getFilms/{Id}

Create films endpoint: POST: http://localhost:8080/springProject/api/films/postFilm

Update films endpoint: PATCH: http://localhost:8080/springProject/api/films/patchFilm

Delete films endpoint: DELETE: http://localhost:8080/springProject/api/films/{id}

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
### Rentals

Read rentals endpoint: GET: http://localhost:8080/springProject/api/rentals/getRental/{id}

Create rentals endpoint: POST: http://localhost:8080/springProject/api/rentals/postRental <b>(feature coming soon)</b>

Update rentals endpoint: PATCH: http://localhost:8080/springProject/api/rentals/patchRental <b>(feature coming soon)</b>

Delete rentals endpoint: DELETE: http://localhost:8080/springProject/api/rentals/{id} <b>(feature coming soon)</b>

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
