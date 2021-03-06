# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
from flask_app.models import dojo
# model the class after the user table from our database
class Ninja:
    def __init__(self,data):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.age = data['age']
        if "dojo_id" in data:
            self.dojo = dojo.Dojo.get_one({'id' : data['dojo_id']})
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
    @classmethod
    def create(cls,data):
        query = """
        INSERT INTO ninjas (first_name, last_name, age, dojo_id, created_at, updated_at)
        VALUES (%(first_name)s,%(last_name)s,%(age)s,%(dojo_id)s, NOW(), NOW());
        """
        result = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return result
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM ninjas;"
        results = connectToMySQL('dojos_and_ninjas').query_db(query)
        ninjas = []
        for ninja in results:
            ninjas.append(cls(ninja))
        return ninjas
    @classmethod
    def get_one(cls,data):
        query = "SELECT * FROM ninjas WHERE id = %(id)s;"
        result = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return cls(result[0])
    @classmethod
    def update(cls,data):
        query = """
        UPDATE ninjas SET first_name = %(first_name)s, last_name = %(last_name)s, age = %(age)s, dojo_id = %(dojo_id)s, updated_at = NOW()
        WHERE id = %(id)s;
        """
        result = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return result
    @classmethod
    def delete(cls,data):
        query = "DELETE FROM ninjas WHERE id=%(id)s;"
        results = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return results