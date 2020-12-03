# mindful-trader

Project CS Software development Stock

Welcome to our proof of concept, you can see in the main folder several folders (Hello Warudo, bin, demo, authentification etc...) the only important one here is 'authentification', you can go and check what is inside the other ones but it is mostly not-yet finished pieces of code that won't make sense by themselves.
Our proof of concept can be launched by running "mindful-trader-main/authentification/authentification/target/securing-web-0.0.1-SNAPSHOT.jar" (nothing will show up right now)
It will lauch a process on your localhost port 8080. To check it you can type 'localhost:8080' in the adress bar of your browser.
This will lead you to Welcome page, by clicking the link you will arrive on the login page. The username is "seagull" and the password is "password". From there you can look at the analysis algorithm part or the portfolio part. 
Analysis algorithm : you can run the algorithm on trhee different samples of data and get advices about those stocks. Here the sample data is just created in a local variable of the html file, but we are currently working on the database to store it.
Portfolio : This part requires the access to data about the user (namely its portfolio), which requires the access to the spring-security database. There are tutorials online to do this but not enough time to code before the deadline.

Once you are done with looking at the proof of concept, I would advice you to kill the process, in order to do not keep it running for no reason. You can do this by typing the following in the command prompt (windows):
netstat  -ano  |  findstr  8080
You should get something like this (where the important thing is that we see the process id is something like 19788) :
TCP    0.0.0.0:18080          0.0.0.0:0              LISTENING       19788
You can then :
taskkill  /F  /PID  19788
  
  
For the structure of the software, here is a little summary.
We have 5 html files, each coding one page. There is no javascript file as what we are doing is pretty basic right now. We will, however, create a separate file for the analysis algorithm later on in the project when we will have more analysis functions (the algo file was a prototype of this).
The "welcome.html" is the page that opens first, giving the link to the softawre (hello.html). The "login.html" opens when you try to access a page and you are not authentified, it then redirects you to the page you tried to access. "hello.html" is the page that opens once you login, it displays the Username and can redirect you to both the analysis algorithm and the portfolio management. "page2.html" is the algorithm page. It contains as a local variable, data for three different companies. Three options to run the algorithm on and the returned advice opens a new page when returned. "portfolio.html" is the portfolio page, it does not contain yet the link to the database to update the list of owned shares by the user, but we will add it too.
The login page goes and checks in its database if the information given by the user is true or not. all the data is (almost) secured. The tutorial used to create this authentification system said that for project purposes it was enough, but an experienced hacker (or good programmer) could still go and look at 'what is expected' by the login page, making it unsufficient for commercial purpose. 
