# 2
CREATE DATABASE IF NOT EXISTS employee;

USE employee;

# -------------------------------------------------------------------

# 3.1
CREATE TABLE department (
    department_id INT,
    department_name VARCHAR(10),
    PRIMARY KEY (department_id)
);

# 3.2
CREATE TABLE employee (
  employee_id INT,
  employee_name VARCHAR(100),
  salary INT,
  department_id INT,
  PRIMARY KEY (employee_id),
  FOREIGN KEY (department_id) REFERENCES department(department_id)
);

# -------------------------------------------------------------------

INSERT INTO department VALUES (1, 'Software Development'),
                              (2, 'Cybersecurity'),
                              (3, 'Data Analytics'),
                              (4, 'R&D');

INSERT INTO employee VALUES (2006499, 1, 'Asish', 1200000),
                            (2006500, 1, 'Tony Stark', 1200000),
                            (2006501, 2, 'Steve Rogers', 800000),
                            (2006502, 2, 'Star Lord', 700000),
                            (2006503, 3, 'Thor Odinson', 1000000),
                            (2006504, 3, 'Loki Odinson', 900000),
                            (2006505, 4, 'Natasha Romanoff', 1200000),
                            (2006506, 4, 'Wanda Maximoff', 1100000);

# -------------------------------------------------------------------

# 4.1
SELECT employee_id, employee_name, department.department_name FROM employee INNER JOIN department WHERE employee.department_id = department.department_id;

# 4.2
SELECT employee_name, salary FROM employee ORDER BY salary DESC;

# 4.3
SELECT department.department_name, AVG(employee.salary) AS Average_Salary FROM employee INNER JOIN department WHERE employee.department_id = department.department_id GROUP BY department.department_name;