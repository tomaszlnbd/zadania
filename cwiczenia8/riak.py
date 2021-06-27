import requests
URL = 'http://localhost:8098/buckets/s23864/keys/'
def get(key):
    print("\n##### GET")
    statusCode=requests.get(URL + key).status_code
    content=requests.get(URL + key).text
    print("Status code: "+str(statusCode))
    print("Content: "+content)

print("\n##### POST")
car = {'model': 'Giulia', 'HP': 200, 'year' : 2019, 'price' : 100000}
print(requests.post(URL + "alfa romeo", data=car).status_code)
get("alfa romeo")
print("\n##### PUT")
car = {'model': 'Giulia', 'HP': 200, 'year' : 2019, 'price' : 80000}
print(requests.put(URL + "alfa romeo", data=car).status_code)
get("alfa romeo")
print("\n##### DELETE")
print(requests.delete(URL + "alfa romeo").status_code)
get("alfa romeo")
