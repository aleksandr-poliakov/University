#!/bin/sh

#================================
DB_PASS_FILE=
if [ -z "$DB_PASS_FILE" ]
then
      echo ""
else
      export DB_PASS=$(cat $DB_PASS_FILE)
fi
#================================
#run app
java -jar app.jar