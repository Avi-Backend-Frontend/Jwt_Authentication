# Jwt_Authentication
Jwt token generation and authentication

Step-1 : Run the application

Step-2 : Go to postman 
1) post : localhost:9900/token  

2) Body->Row->Json {
    "username":"Sipun",
    "password":"Sipun123"
}
3) Run 
4) You will get a barrear token like this : {
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJTaXB1biIsImV4cCI6MTY5MzMyNTY4MSwiaWF0IjoxNjkzMzA3NjgxfQ.OosQJ9fDz0Rfj9btngKDmFNvBlQIVOAEaRmptB0It-8O13Up-fmNIfD0BbBy_PFSjU5IiK858oWTKk1InK9VJg"
}

Step-3 : 
1) get : localhost:9900/welcome/hii
2) Headers:
   key-> Authorization
   value-> Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJTaXB1biIsImV4cCI6MTY2NTU3ODMzNywiaWF0IjoxNjY1NTYwMzM3fQ.7X3Asu6yoNrDV62sg8LZS2Fu2LhRPsYP2utlyHus2mGv7WYrtqyNM_lKo0WwbX1ZSlaPu8wdmhWCuqXpexTdCA
3) Run ; Output : Welcome to Balasore


More.......   

