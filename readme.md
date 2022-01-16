#Rest Gps.
---
#####The following methods are available in the service.

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
