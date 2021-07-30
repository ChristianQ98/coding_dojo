from flask_app.config.mysqlconnection import connectToMySQL
from flask import flash

class Dojo:
    @staticmethod
    def validate(form):
        is_valid = True
        if(len(form['name']) < 3):
            flash("Name must be 3 characters or more")
            is_valid = False
        if(len(form['dojo_location']) < 3):
            flash('Dojo Location must be 3 characters or more')
            is_valid = False
        if(form['favorite_language'] == -1):
            flash('Please select a favorite language value')
            is_valid = False
        return is_valid
    @classmethod
    def create(cls,data):
        query = """"
        INSERT INTO dojos (name, location, language, comment, created_at, updated_at)
        VALUES (%()s, %()s, %()s, %()s, NOW(), NOW());
        """
        result = connectToMySQL('dojo_survey_schema').query_db(query,data)
        return result