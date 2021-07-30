from flask_app.models.dojo_model import Dojo
from flask_app import app
from flask import render_template,redirect,request,session,flash

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/process', methods=['POST'])
def survey():
    if not Dojo.validate(request.form):
        return redirect('/')
    session['name'] = request.form['name']
    session['dojo_location'] = request.form['dojo_location']
    session['favorite_language'] = request.form['favorite_language']
    session['comment'] = request.form['comment']
    Dojo.create(request.form)
    return redirect('/result')

@app.route('/result')
def result():
    return render_template('result.html',
    name = session['name'],
    dojo_location = session['dojo_location'],
    favorite_language = session['favorite_language'],
    comment = session['comment']
    )