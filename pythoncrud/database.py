from pymongo import MongoClient
import certifi

MONGO_URI = 'mongodb+srv://<user>:<pass>@cluster0.mct2kae.mongodb.net/?retryWrites=true&w=majority'
ca = certifi.where()

def dbConnect():
    try:
        client = MongoClient(MONGO_URI, tlsCAFile=ca)
        db = client["dbb_products_app"]
    except ConnectionError:
        print("Error al conectar a la bdd")
    return db