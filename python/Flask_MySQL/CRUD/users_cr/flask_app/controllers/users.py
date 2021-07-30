from flask_app import app
from flask import render_template,redirect,request,url_for,session,flash
from flask_app.models.user import User

@app.route('/')
def index():
    users = User.get_all()
    return render_template('read_all.html', all_users = users)

@app.route('/users/new')
def new_user():
    return render_template('create.html')

@app.route('/create_user', methods=["POST"])
def create_user():
    User.create(request.form)
    return redirect('/')

@app.route('/users/<int:id>')
def display_user(id):
    return render_template('/show_user.html', user = User.get_one({"id" : id}))

@app.route('/users/<int:id>/edit')
def edit_user(id):
    return render_template('edit_user.html', id = id, user = User.get_one({"id" : id}))

@app.route('/users/<int:id>/update', methods=["POST"])
def update_user(id):
    dict = {
        **request.form,
        "id" : id
    }
    User.update(dict)
    return redirect(url_for('display_user', id=id))

@app.route('/users/<int:user_id>/delete')
def delete_user(user_id):
    User.delete({"id" : user_id})
    return redirect('/')