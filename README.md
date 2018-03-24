# cache-service
Example event based application used to update cache entries

Build then image:
`./gradlew docker build`

Run the image:
`docker run -p 8080:8080 -t com.digiup/cache-service`

Stop the image:
`docker stats`
`docker stop {ID}`