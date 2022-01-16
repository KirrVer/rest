#Rest Gps

To check the operation of applications, you need to install BD MySQL.
Having opened the source code in IDEA and connected the database, 
you need to execute SQL scripts **initDB.sql** and **populateDB.sql** 
to create a test table.
This will create a "rest" schema in the BD, and a "devices" table, 
and populate the table with test data as well.
The database password is in `application.properties`
It can be changed to whatever you need.
---
###The following methods are available in the service.

- Adding a new device using the POST method
    * In the body of the request, you need to pass JSON 
  
    `{'deviceId':'12345', 'latitude': 505430, 'longitude': 1423412}`
- Getting device by ID (ID assigned by BD) - GET method

  * request like ` .../api/devices/1 ` 
- List of all devices from BD  - GET method` .../api/devices ` 
 
- Remove device by ID (ID from BD) - DELETE method 
  * request like ` .../api/devices/1 ` 
- Device update - PUT method
  * * In the body of the request, you need to pass JSON

  `{'id':'1','id_device':'12345', 'latitude': 505430, 'longitude': 1423412}`

All features can be tested with Postman or a browser.