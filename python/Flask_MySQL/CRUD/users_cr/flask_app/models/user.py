# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL
# model the class after the user table from our database
class User:
    def __init__( self, data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.email = data['email']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
        # Now we use class methods to query our database
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM users;"
        # make sure to call the connectToMySQL function with the schema you are targeting.
        results = connectToMySQL('users').query_db(query)
        # Create an empty list to append our instances of users
        users = []
        # Iterate over the db results and create instances of users with cls.
        for user in results:
            users.append( cls(user) )
        return users
    # class method to save our users to the database
    @classmethod
    def create(cls,data):
        query = """
        INSERT INTO users (first_name, last_name, email)
        VALUES (%(fname)s, %(lname)s, %(email)s);
        """
        user_id = connectToMySQL('users').query_db(query, data)
        return user_id
    @classmethod
    def get_one(cls,data):
        query = "SELECT * FROM users WHERE id = %(id)s;"
        results = connectToMySQL('users').query_db(query,data)
        return cls(results[0])
    @classmethod
    def update(cls,data):
        query = """
        UPDATE users SET first_name = %(fname)s, last_name = %(lname)s, email = %(email)s, updated_at = NOW()
        WHERE id = %(id)s;
        """
        results = connectToMySQL('users').query_db(query,data)
        return results
    @classmethod
    def delete(cls,data):
        query = """
        DELETE FROM users WHERE id = %(id)s;
        """
        results = connectToMySQL('users').query_db(query,data)
        return results