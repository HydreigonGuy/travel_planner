
import requests

url = "http://127.0.0.1:8080"


# create user
requests.post(f"{url}/traveler/", json={
    "id":1,
    "username":"test_user"
})


# get my trips
requests.get(f"{url}/trip/getMyTrips")


# get places
r = requests.get(f"{url}/place/")
place_id = r.json()["places"][0]["id"]


# create trip
r = requests.post(f"{url}/trip/", json={
    "id":1
})
id = r.json()["id"]


# get trip
requests.get(f"{url}/trip/{id}")


# add user to trip
requests.post(f"{url}/trip/addUser", json={
    "tripID":id,
    "userID":2
})


# create destination
r = requests.post(f"{url}/destination/", json={
    "id":1,
    "tripID":id,
    "placeID":1
})
dest_id = r.json()["id"]


# add destination to trip
requests.post(f"{url}/trip/addDestination", json={
    "tripID":id,
    "destinationID":dest_id
})
