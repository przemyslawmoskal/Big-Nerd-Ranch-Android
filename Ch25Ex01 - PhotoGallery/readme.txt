Ch25Ex01: Gson

Deserializing JSON in Java objects, as you did in Listing 25.12, is a common
task in app development regardless of the platform. Lots of smart people have
created libraries to simplify the process of converting JSON text to Java objects
and back again. One such library is Gson (github.com/google/gson).
Gson maps JSON data to Java objects for you automatically. This means you do
not need to write any parsing code. For this reason, Gson is currently our
favorite JSON parsing library. For this challenge, simplify your JSON
parsing code in FlickrFetchr by incorporating the Gson library into your app.