# SQ72repo
SQ72repo

Steps to setup the project :

1. Softwares Required

 a. Eclipse
 b. Maven
 c. GIT
 
2. Clone the project from GIT to local workspace.
  GIT Repo URL : https://github.com/Raju370/SQ72repo.git

3. Run below maven command
   mvn clean install

4. Test NG will start the below tests
   a. SpaceXShopUITest
   b. GetAPITest
   

Followed below steps to create the application.
 
1. Create a Maven Project (Ex: sq72assignment)

2. Add below required dependencies to pom.xml

 a. Selenium
 		<dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-java</artifactId>
		    <version>4.8.3</version>
		</dependency>
		
 b. Webdriver
		<dependency>
		    <groupId>io.github.bonigarcia</groupId>
		    <artifactId>webdrivermanager</artifactId>
		    <version>5.3.2</version>
		</dependency>
		
 c. TestNG
 		<dependency>
		    <groupId>org.testng</groupId>
		    <artifactId>testng</artifactId>
		    <version>7.7.1</version>
		</dependency>
		
 d. Rest-Assured
 		<dependency>
		    <groupId>io.rest-assured</groupId>
		    <artifactId>rest-assured</artifactId>
		    <version>5.3.0</version>
		</dependency>
		
3. Implemented selenium tests following Page Object Model.

4. Implemented REST api tests using Rest Assured.

5. Run The Tests Using Below Command
   D:\SQ72project\SQ72repo\sq72assignment>mvn clean install

Test Results:
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@130f889
=====Browser Session Started=====
Starting ChromeDriver 111.0.5563.64 (c710e93d5b63b7095afe8c2c17df34408078439d-refs/branch-heads/5563@{#995}) on port 31003
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
MEN'S SPACEX T-SHIRT $30.00
SPACEX SCHEMATIC STICKER PACK $15.00
MEN'S SPACEX POLO $40.00
SPACEX BACKPACK $75.00
SPACEX F9 MODEL $150.00
SPACEX WATER BOTTLE $35.00
SPACEX CAP $25.00
KID'S SPACEX SPACESUIT ONESIE $45.00
UNISEX SPACEX PULLOVER HOODIE $50.00
UNISEX SPACEX SWEATSHIRT $45.00
UNISEX SPACEX ZIPPER HOODIE $50.00
SPACEX JOURNAL $30.00
SPACEX ONESIE $15.00
KID'S SPACEX T-SHIRT $20.00
SPACEX STARSHIP STACK METAL ART PRINT $499.00
KID'S SPACEX PULLOVER HOODIE $28.00
KID'S SPACEX ZIPPER HOODIE $28.00
WOMEN'S SPACEX POLO $40.00
X ADJUSTABLE CAP $25.00
REMOVE BEFORE FLIGHT KEY CHAINS $15.00
OCCUPY MARS "HEAT SENSITIVE" TERRAFORMING MUG $20.00
STARLINK STICKER PACK $15.00
REMOVE BEFORE FLIGHT KEY CHAINS $15.00
MEN'S BOMBER JACKET $140.00
STARSHIP POSTER PACK $30.00
STARLINK ADJUSTABLE CAP $25.00
=====Browser Session End=====
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 28.488 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0


