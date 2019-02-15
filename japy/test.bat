cd ..\antlr
python build.py
cd ..\japy
mvn test -Dtest=org.luncert.AppTest