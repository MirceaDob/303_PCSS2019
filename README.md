Instructions:

Client:

When running the client, the application will prompt you with an IP to connect to, requiring a valid IPv4 address currently hosting the server application.


The main file on the client consists of the Client.java, with various additional classes, detailed on the UML diagram.





Server:

Hosting the server has the prerequisite of the host PC running the MySQL service, and containing a database and table, both named 'questions'. Table data is included in the 'SQL' folder, and currently must contain 20 questions.

Setting up the server allows clients to connect and test their knowledge on the questions provided.

The main file on the server consists of the 'Server.java' file, with the following classes in the package: MySQL and ShuffleRand; which contain methods to handle the SQL service and generation of random ID's to access the SQL database with.



