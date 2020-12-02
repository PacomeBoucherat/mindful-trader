# mindful-trader
Project CS Software development Stock
Welcome to our proof of concept, you can see in the min folder several folders (Hello Warudo, bin, demo, authetification etc...) the only important one here is 'authentification', you can go and check what is inside the other ones but it is mostly not-yet finished pieces of code that won't make sense by themselves.
Our proof of concept can be launched by running "mindful-trader-main/authentification/authentification/target/securing-web-0.0.1-SNAPSHOT.jar".
It will lauch a process on your localhost port 8080. To check it you can type 'localhost:8080' in the adress bar of your browser.
This will lead you to to Welcome page, by clicking the link you will arrive on the login page. The username is "seagull" and the password is "password". From there you can look at the analysis algorithm part of the portfolio part. 
Analysis algorithm : you can run the algoithm on trhee different samples of data and get advices about those stocks. Here the sample data is just created in a local variable of the html file, but we are currently working on the database to store it.
Portfolio : This part requires the access to data about the user (namely its portfolio), which requires the access to the spring-security database. There are tutorials online to do this but not enough time to code before the deadline.

Once you are done with looking at the proof of concept, I would advice you to kill the process, in order to do not keep in running for no reason. You can do this by typing the following in the command prompt (windows):
netstat  -ano  |  findstr  8080
You should get something like this (where the important thing is that we see the process id is something like 19788) :
TCP    0.0.0.0:18080          0.0.0.0:0              LISTENING       19788
You can then :
taskkill  /F  /PID  <Process Id>
  
  
