@echo off

set DEBUG_MODE=

if "%1" == "debug" (
  set DEBUG_MODE=debug
)

cd net.frontuari.importdataprocess.targetplatform
call .\plugin-builder.bat %DEBUG_MODE% ..\net.frontuari.importdataprocess ..\net.frontuari.importdataprocess.test
cd ..
