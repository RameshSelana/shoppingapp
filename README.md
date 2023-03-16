# Shopping Application
MVP version of Shopping Application 

Tech stack used :

Client : Integerated Swagger UI to use as client.
Application : SpringBoot with Spring Web/Spring Data JPA
Databse Server : H2 in-memory database

Prerequist: Pre-load data in ITEM_CATALOG table of H2 database server (attached screenshot here).

<img width="590" alt="Screenshot 2023-03-16 at 11 48 15 PM" src="https://user-images.githubusercontent.com/46433295/225716086-5e058968-4f5c-4c2a-ba43-381556dd95d6.png">

REST API deails of Shopping App:

Checkout module of Shopping system designed by creating two incremental version of CheckoutItem API. An idea behind this to make release of 
new feature (like offer discount on Items) in system with existing functionality of system should work as expected. Screen shot of Swagger attached as reference.

CheckoutItem API : 
<img width="1432" alt="Screenshot 2023-03-16 at 11 30 22 PM" src="https://user-images.githubusercontent.com/46433295/225711219-52b4bd66-22d6-49e8-8e54-b31b22ae3085.png">



1. CheckoutItemV1 API : This API allow user to pass list of item which they want to buy as input and get back response as Items details with
thier total prices.

Request of API :

<img width="1096" alt="Screenshot 2023-03-16 at 11 33 44 PM" src="https://user-images.githubusercontent.com/46433295/225712017-5e491e78-9bb8-4ae9-82f7-4a6e60c50f26.png">

Response of API :

<img width="1065" alt="Screenshot 2023-03-16 at 11 35 15 PM" src="https://user-images.githubusercontent.com/46433295/225712286-0ad69ee8-dfad-4420-ab92-4c693fc8b18f.png">

2. CheckoutItemV2 API : This API allow user to pass list of item which they want to buy as input and allow shopper to give offer of discount percentage
on items. Note as of now discount and price configured at database layer.

Request of API :

<img width="1101" alt="Screenshot 2023-03-16 at 11 38 36 PM" src="https://user-images.githubusercontent.com/46433295/225712976-a6e06257-06de-49bd-9ad1-5cf42d3c0afd.png">

Response of API :

<img width="1078" alt="Screenshot 2023-03-16 at 11 40 53 PM" src="https://user-images.githubusercontent.com/46433295/225713561-f9d3cf2e-8903-4c23-8ac4-8a1effd51e02.png">



