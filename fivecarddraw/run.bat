ECHO Application starting..........
call mvn clean package
call mvn exec:java -Dexec.mainClass="com.epiuselabs.fivecarddraw.application.FiveCardDrawApplication"
PAUSE