# Library-Management-System
Library Management System (Springboot / H2 DB / Maven / lombok / validation) 

**configrations:**
>PORT: 3000 <br />

>DATABASE :
>>    H2 DB : http://localhost:3000/h2-console/ <br />
>>    driverClass=: org.h2.Driver <br />
>>    jdbc url: jdbc:h2:mem:library_db <br />
>>    username: sa <br />
>>    password:  <br />

![alt text](/readme%20images/image.png) <br />



TO GET APIS BELLOW IN THE LINK <br />
https://dark-crescent-975857.postman.co/workspace/personal~761dedc7-98e9-4e45-a220-d0c3cc458898/collection/18352879-0a1baca2-3850-479f-8882-af17565a6b9d?action=share&creator=18352879 <br />

**Library Mangment System APIS:**   
>**Book endpoints:**

>>  Get All Books:
>>> http://localhost:3000/api/get-all-books
>>>>![alt text](/readme%20images/image-1.png)

>>  Get Book By ID:
>>> http://localhost:3000/api/get-book?id=5
>>>>![alt text](/readme%20images/image-3.png)

>>  Post book:
>>>http://localhost:3000/api/post-book
>>>>![alt text](/readme%20images/image-4.png)

>>  Delete Book:
>>>http://localhost:3000/api/delete-book?id=6
>>>>![alt text](/readme%20images/image-5.png)

>>  Update Book:
>>>http://localhost:3000/api/put-book
>>>>![alt text](/readme%20images/image-6.png)

>**Patrons endpoints:**

>>  Get All Patrons:
>>>http://localhost:3000/api/get-all-patrons
>>>>![alt text](/readme%20images/image-7.png)

>>  Get Patron by ID:
>>>http://localhost:3000/api/get-patron?id=5
>>>>![alt text](/readme%20images/image-8.png)

>>  Post Patron:
>>>http://localhost:3000/api/post-patron
>>>>![alt text](/readme%20images/image-9.png)

>>  Delete Patron:
>>>http://localhost:3000/api/delete-patron?id=5
>>>>![alt text](/readme%20images/image-10.png)

>>  Update Patron:
>>>http://localhost:3000/api/put-patron
>>>>![alt text](/readme%20images/image-11.png)

>**Borrowing endpoints:**

>>  Post Borrowing:
>>>http://localhost:3000/api/post-borrowing
>>>>![alt text](/readme%20images/image-12.png)

>>  Update Borrowing:
>>>http://localhost:3000/api/put-borrowing
>>>>![alt text](/readme%20images/image-13.png)