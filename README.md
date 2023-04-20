# Students-CRUD-REST API
# Spring Boot, JPA

Restful CRUD API for a Student using Spring Boot, Mysql, JPA and Hibernate.

# Visit following link to read API test documentation
**Tested Using Postman**

https://documenter.getpostman.com/view/26450292/2s93Y2TNQ8

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/Raghavendra-Thakur/Spring_Student_CRUD.git
```


**2. Open Project Using STS IDE or Eclipse IDE**


The app will start running at <http://localhost:8080>

## Explore Rest APIs

The app defines following CRUD APIs.

### Students

| Method | Url | Description | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /students | Get All Students | |
| GET    | students/{id} | Get Student  by ID | |
| POST   | /students | Add Student | [JSON](#usercreate) |
| PUT    | /students/update/{id} | Update Student | [JSON](#userupdate) |
| DELETE | /students/delete/{id} | Delete Student | |


Test them using postman or any other rest client.

## Sample Valid JSON Request Bodys


##### <a id="usercreate">Create Student -> /api/users</a>
```json
{
"name": "rajiv",
"phoneno": "9545632196",
"division": "A"
}
```

##### <a id="userupdate">Update Student -> /api/users/{username}</a>
```json
{
"name": "rajiv",
"phoneno": "9545632196",
"division": "A"
}
```


