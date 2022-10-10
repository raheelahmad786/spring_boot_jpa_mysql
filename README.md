# spring_boot_jpa_mysql

# Example

https://start.spring.io/

<img width="1654" alt="Screenshot 2022-10-10 at 3 12 29 PM" src="https://user-images.githubusercontent.com/7985860/194843690-f82732fc-a9a7-4e60-ba35-7ab59c9ff055.png">

Pom.xml

Add Dependency

<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>

Table

" CREATE TABLE `Session` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci "

Postman

<img width="1015" alt="Screenshot 2022-10-10 at 3 16 53 PM" src="https://user-images.githubusercontent.com/7985860/194844518-ecbc2301-3b70-49c9-8fdc-bd15df4dc833.png">
