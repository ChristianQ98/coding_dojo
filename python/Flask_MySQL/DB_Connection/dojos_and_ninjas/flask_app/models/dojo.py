# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
from flask_app.models import ninja
# model the class after the user table from our database
class Dojo:
    def __init__(self,data):
        self.id = data['id']
        self.name = data['name']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
        self.ninjas = []
    # class method to save our users to the database
    @classmethod
    def create(cls,data):
        query = """
        INSERT INTO dojos (name, created_at, updated_at)
        VALUES (%(name)s, NOW(), NOW());
        """
        dojo_id = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return dojo_id
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM dojos;"
        results = connectToMySQL('dojos_and_ninjas').query_db(query)
        dojos = []
        for dojo in results:
            dojos.append(cls(dojo))
        return dojos
    @classmethod
    def get_one(cls,data):
        query = "SELECT * FROM dojos LEFT JOIN ninjas ON dojos.id = ninjas.dojo_id WHERE dojos.id=%(id)s;"
        results = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        print(results)
        dojo = cls(results[0])
        # if there is no ninja, the ninjas.id == None; None == False
        # if there is a ninja, the ninjas.id == some number; == True
        if not results[0]['ninjas.id'] == None:
            for row in results:
                row_data = {
                    'id' : row['ninjas.id'],
                    'first_name' : row['first_name'],
                    'last_name' : row['last_name'],
                    'age' : row['age'],
                    'created_at' : row['ninjas.created_at'],
                    'updated_at' : row['ninjas.updated_at']
                }
                dojo.ninjas.append(ninja.Ninja(row_data))
        return dojo
    @classmethod
    def update(cls,data):
        query = "UPDATE dojos SET name=%(name)s WHERE id=%(id)s;"
        result = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return result
    @classmethod
    def delete(cls,data):
        query = "DELETE FROM dojos WHERE id=%(id)s;"
        results = connectToMySQL('dojos_and_ninjas').query_db(query,data)
        return results
    # @classmethod
    # def get_dojo_with_ninjas(cls,data):
    #     query = """SELECT * FROM dojos 
    #     LEFT JOIN ninjas ON dojos.id = ninjas.dojo_id
    #     WHERE ninjas.id = %(id)s;
    #     """
    #     results = connectToMySQL('dojos_and_ninjas').query_db(query,data)
    #     dojo = cls(results[0])
    #     for row_from_db in results:
    #         ninja_data = {
    #             'id' : row_from_db['ninjas.id'],
    #             'first_name' : row_from_db['first_name'],
    #             'last_name' : row_from_db['last_name'],
    #             'age' : row_from_db['age'],
    #             'created_at' : row_from_db['ninjas.created_at'],
    #             'updated_at' : row_from_db['ninjas.updated_at']
    #         }
    #         dojo.ninjas.append(ninja.Ninja(ninja_data))
    #     return dojo