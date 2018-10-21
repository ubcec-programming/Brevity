# Brevity
Brant, Bill, Evan

Our team thought to create a social media app based on your current location via geocoding.
This allows you to view messages posted within a certain radius, with a setting to view only certain tags.

For example, a tourist would prefer to view #travel for fun places to go or maybe #Warning to avoid dangerous areas.
The front end would interact with our User class, the database is the geoMap class and everything else is the backend.
With plans to eventually link our system to Google Map Services, we firstly created a simple latitude-longitude datatype called PositionPair. This links all messages to a certain location which is then stored in our geoMap.

When a user sets a certain update range, they will pull and view all previous posted messages within that range.
Using a scanner, it was also possible to scan certain keywords to filter, allowing targeted user preferred messages instead.

Development direction:
Front-end Android: XML, Android code
Google Maps API: geocoding to connect to a viable map database
