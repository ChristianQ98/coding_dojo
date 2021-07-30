from flask_app import app
from flask import render_template,redirect,request,url_for,session,flash
from flask_app.models.dojo import Dojo
from flask_app.models.ninja import Ninja

@app.route('/')
def index():
    dojos = Dojo.get_all()
    return render_template('index.html', all_dojos = dojos)

@app.route('/dojos/create', methods=["POST"])
def create_dojo():
    Dojo.create(request.form)
    return redirect('/')

@app.route('/dojos/<int:id>')
def show_dojo(id):
    show_dojo = Dojo.get_one({'id' : id})
    return render_template('show_dojo.html', one_dojo = show_dojo)