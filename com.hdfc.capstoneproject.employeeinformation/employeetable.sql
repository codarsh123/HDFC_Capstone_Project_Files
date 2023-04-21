show databases;

CREATE DATABASE employee_information_database;

USE employee_information_database;

 CREATE TABLE Employee (
         EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
         EmployeeName VARCHAR(50),
         DateOfBirth DATE
     );

INSERT INTO Employee (EmployeeName, DateOfBirth)
     VALUES ('Adarsh Verma', '2000-08-18');

 select * from Employee;

INSERT INTO Employee (EmployeeName, DateOfBirth)
     VALUES
         ('Alph shortz ', '2001-01-01'),
         ('Jane Smith', '1985-02-15'),
         ('Bob Johnson', '1995-03-25'),
         ('Mary Davis', '1992-04-30'),
         ('Tom Wilson', '1988-05-10'),
         ('Sara Lee', '1991-06-20'),
         ('Mike Brown', '1989-07-05'),
         ('Emily Davis', '1994-08-15'),
         ('David Lee', '1993-09-25'),
         ('Karen Smith', '1990-10-30');