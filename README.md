# Scala Assignment - 6

## Steps To clone & Run the Project In IntelliJ IDEA

**Step 1:** Copy the link of the project   
**Step 2:** In your system, select the directory in which you want the project directory.  
**Step 3:** Right-click on the system and open the terminal.   
**Step 4:** After that write the below command to clone the project into your system.
> git clone --paste the url--

**Step 5:** After that Open IntelliJ Idea and on the top right click on file->open->select the folder that you cloned in
system
> File/Open/ProjectFolder

**Step 6:** Setup the jdk and java version.  
**Step 7:** It took some time to build the project in the IntelliJ Terminal wait for few seconds.  
**Step 8:** Now open the Terminal of IntelliJ and run the following command.
**1. To compile the project**
> sbt clean compile

**2. To Run the Project**
> sbt run

**3. To Compile the Test Cases**
> sbt test

**4. To Check the Scalastyle Config or Warning**
> sbt scalastyle

**5. To Check the Coverage Report of the Test Cases**
> sbt clean coverage test   
> sbt coverageReport

OUTPUT
![Screenshot from 2023-04-25 18-04-44](https://user-images.githubusercontent.com/124979629/234277876-0e18f44f-4ac3-4d23-b6cb-c88f8798a452.png)

![Screenshot from 2023-04-25 18-05-40](https://user-images.githubusercontent.com/124979629/234277899-e027f05e-93ac-4a9e-b6ee-9b96e3a56508.png)
![Screenshot from 2023-04-25 18-07-09](https://user-images.githubusercontent.com/124979629/234278102-d6e06770-ea7a-4a54-955a-1474745486f1.png)
