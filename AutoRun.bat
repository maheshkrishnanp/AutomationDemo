@Echo off
set LOGFILE=.\LOG.log
call :Logit >> %LOGFILE%
exit /b 0
:Logit

set projectpath=C:\Users\IBM_ADMIN\Desktop\Selenium\eclipse\Workspaces\JenkinsTrial
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\TestNG.xml

#pause
