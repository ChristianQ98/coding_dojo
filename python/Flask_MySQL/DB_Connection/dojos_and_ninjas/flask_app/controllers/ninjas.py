from flask_app import app
from flask import render_template,redirect,request,url_for,session,flash
from flask_app.models.ninja import Ninja
from flask_app.models.dojo import Dojo

@app.route('/ninjas')
def new_ninja():
    dojos = Dojo.get_all()
    return render_template('create_ninja.html', all_dojos = dojos)

@app.route('/ninjas_create', methods=["POST"])
def create_ninja():
    Ninja.create(request.form)
    # return redirect('/')
    return redirect('/dojos/' + request.form['dojo_id'])