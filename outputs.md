## Q4 - Queries and Outputs

```sql
SELECT employee_id, employee_name, department.department_name FROM employee INNER JOIN department WHERE employee.department_id = department.department_id;
```

1.  | employee_id | employee_name    | department_name      |
    | :---------- | :--------------- | :------------------- |
    | 2006499     | Asish            | Software Development |
    | 2006500     | Tony Stark       | Software Development |
    | 2006501     | Steve Rogers     | Cybersecurity        |
    | 2006502     | Star Lord        | Cybersecurity        |
    | 2006503     | Thor Odinson     | Data Analytics       |
    | 2006504     | Loki Odinson     | Data Analytics       |
    | 2006505     | Natasha Romanoff | R&D                  |
    | 2006506     | Wanda Maximoff   | R&D                  |

<br />
<br />

```sql
SELECT employee_name, salary FROM employee ORDER BY salary DESC;
```

2.  | employee_name    | salary  |
    | :--------------- | :------ |
    | Asish            | 1200000 |
    | Tony Stark       | 1200000 |
    | Natasha Romanoff | 1200000 |
    | Wanda Maximoff   | 1100000 |
    | Thor Odinson     | 1000000 |
    | Loki Odinson     | 900000  |
    | Steve Rogers     | 800000  |
    | Star Lord        | 700000  |

<br />
<br />

```sql
SELECT department.department_name, AVG(employee.salary) AS Average_Salary FROM employee INNER JOIN department WHERE employee.department_id = department.department_id GROUP BY department.department_name;
```

3.  | department_name      | Average_Salary |
    | :------------------- | :------------- |
    | Software Development | 1200000.0000   |
    | Cybersecurity        | 750000.0000    |
    | Data Analytics       | 950000.0000    |
    | R&D                  | 1150000.0000   |
