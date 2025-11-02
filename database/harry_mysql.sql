create database startsql;
use startsql;

create table users(
id int not null auto_increment primary key,
name varchar(100) not null,
email varchar(100) unique not null,
gender enum('male','female','other'),
date_of_birth date,
created_at timestamp default current_timestamp
);
-- show table
select * from users; 
-- renam table name
rename table users to programmer;
select * from programmer;
rename table programmer to users;

-- add new column
alter table users add column is_active boolean default true;

-- drop column
alter table users drop column is_active;

-- modify cloumn
alter table users modify name varchar(200);

-- check table detail or datatype 
desc users;

-- modify column
alter table users modify column email varchar(100) after gender;

-- insert value into table
insert into users(name,gender,email,date_of_birth,created_at) values ("aditya","male","adii@gmail.com","2002-09-04",default), ("suraj","male","suraj@gmail.com","1998-12-8",default);

-- cloumn first
alter table users modify date_of_birth date first; 
alter table users modify date_of_birth date after email;

-- like
select * from users where name like "a%"; 

select name from users;
INSERT INTO users (name, gender, email, date_of_birth, created_at)
VALUES
  ('harry', 'male', 'hrry@gmail.com', '2002-09-04', DEFAULT),
  ('jhon', 'male', 'jo@gmail.com', '1998-12-08', DEFAULT),
  ('priya', 'female', 'priya@gmail.com', '2000-05-15', DEFAULT),
  ('rahul', 'male', 'rahul@gmail.com', '1999-10-22', DEFAULT),
  ('neha', 'female', 'neha@gmail.com', '2001-01-30', DEFAULT);
  
  select * from users where gender="female";
    select * from users where date_of_birth < "2002-09-4";
    
    -- between
      select * from users where date_of_birth between "1998-02-4" and "2005-09-1";
      -- in
      select * from users where gender in ("male","female");
      
      select * from users where gender="female" and name ="neha";
       select * from users where gender="female" or name ="neha";
      
      alter table users add column salary varchar(200);
      alter table users drop column salary;
      
      select * from users where gender="female" or name="priya" order by date_of_birth desc limit 1;

CREATE TABLE employees (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  gender VARCHAR(10),
  salary DECIMAL(10,2),
  city VARCHAR(50)
);
INSERT INTO employees (name, gender, salary, city)
VALUES
  ('Aditya', 'Male', 45000.00, 'Pune'),
  ('Neha', 'Female', 48000.00, 'Mumbai'),
  ('Rahul', 'Male', 52000.00, 'Delhi'),
  ('Priya', 'Female', 50000.00, 'Bangalore'),
  ('Suraj', 'Male', 47000.00, 'Nagpur');
  
  select * from employees;
  
  select * from employees where salary>20000 and salary<50000;
  
  select *from employees where salary order by salary desc limit 1 offset 1;
  
  -- update
  update employees set salary = 46000 where id =1;
  alter table employees add column email varchar(100);

update employees set email="aditya@gmail.com" where id=1;
update employees set email="neha@gmail.com" where id=2;
update employees set email="rahul@gmail.com" where id=3;
update employees set email="priya@gmail.com" where id=4;
update employees set email="suraj@gmail.com" where id=5;

alter table employees modify email varchar(100) after name;

update employees set salary="70000" where id=5;

-- modify
alter table employees modify column salary varchar(100);
alter table employees modify column salary varchar(100) not null;
alter table employees modify column salary varchar(100) after email;
alter table employees modify column city varchar(100) first;

alter table employees modify column email varchar(100) not null unique;
alter table employees modify column city varchar(100) not null after gender;
 
set sql_safe_updates=0;
update employees set salary=salary+10000 where salary<45000;
update employees set salary=salary+200 where salary<47000;

-- delete
delete from employees where salary<47000;

-- function
select count(*) from employees; 
select count(*) from employees where gender="female"; 
select min(salary),max(salary) from employees; 
select gender,avg(salary) from employees group by gender;
select gender,max(salary) from employees group by gender;
select name,length(name) as length from employees;

select name, Lower(name) from employees;
select name,upper(name) from employees;
select concat(name,'<>',email) from employees;

select now();

select year(date_of_birth),month(date_of_birth),day(date_of_birth) from users;

-- auto commit
set autocommit=0; -- automatically query not commit when you write after saves for commit
select * from employees;
-- commit; --save changes manually
delete from employees where id=5;
rollback; -- undo commit

set autocommit=1; -- no write commit for save query in database automatically handle

-- forgin key
drop table if exists addresses;
create table addresses(
id int auto_increment primary key,
user_id int,
street varchar(200),
city varchar(100),
state varchar(100),
pincode varchar(10),
constraint fk_users foreign key (user_id) references users(id) on delete cascade
);
INSERT INTO addresses (user_id, street, city, state, pincode) VALUES
(1, '123 MG Road', 'Pune', 'Maharashtra', '411001'),
(2, '456 FC Road', 'Mumbai', 'Maharashtra', '400001'),
(3, '789 JM Road', 'Bangalore', 'Karnataka', '560001'),
(4, '12 Park Street', 'Kolkata', 'West Bengal', '700016'),
(5, '34 Anna Salai', 'Chennai', 'Tamil Nadu', '600002');

select * from addresses;
select * from users;
delete from users where id =5;

-- join
select users.name , addresses.city , addresses.state from users inner join addresses on users.id = addresses.user_id; 
select users.name , addresses.city , addresses.state from users left join addresses on users.id = addresses.user_id; 
select users.name , addresses.city , addresses.state from users right join addresses on users.id = addresses.user_id;

-- union
select name from users 
union
select name from employees;