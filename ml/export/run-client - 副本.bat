@echo off

java -classpath server-client.jar;..\lib\wire-compiler-2.3.0-RC1-jar-with-dependencies.jar network.Client -structName=BCD -structCount=100

pause
