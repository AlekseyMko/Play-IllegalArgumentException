# Play-IllegalArgumentException

## Configuring

setup MySql with empty *test* schema

username/password = root/password or change them in conf/application.conf

## Running
```./sbt run```

## Bug reproducing

1. run application and open localhost:9000 page
2. apply schema evolution requset from Play to init database (one time request)
3. You should see json on the page
4. comment out the ```.useAsm(false)``` line in app/sfm_test.Mappers.java and save file
5. refresh page. You should see 
```[RuntimeException: java.lang.IllegalArgumentException: object is not an instance of declaring class]```