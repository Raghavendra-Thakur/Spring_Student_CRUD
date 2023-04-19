# Students-CRUD- REST API
# Spring Boot, JPA

Restful CRUD API for a Student using Spring Boot, Mysql, JPA and Hibernate.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/Raghavendra-Thakur/Spring_Student_CRUD.git
```


**2. Run the app using maven**

```bash
mvn spring-boot:run
```
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

![segment](https://api.segment.io/v1/pixel/track?data=ewogICJ3cml0ZUtleSI6ICJwcDJuOTU4VU1NT21NR090MWJXS0JQd0tFNkcydW51OCIsCiAgInVzZXJJZCI6ICIxMjNibG9nYXBpMTIzIiwKICAiZXZlbnQiOiAiQmxvZ0FwaSB2aXNpdGVkIiwKICAicHJvcGVydGllcyI6IHsKICAgICJzdWJqZWN0IjogIkJsb2dBcGkgdmlzaXRlZCIsCiAgICAiZW1haWwiOiAiY29tcy5zcHVyc0BnbWFpbC5jb20iCiAgfQp9)
