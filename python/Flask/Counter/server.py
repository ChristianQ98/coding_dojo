from flask import Flask, render_template, request, redirect, session
from flask.helpers import make_response

app = Flask(__name__)
app.secret_key = "My secret key"

visits = 0

@app.route('/')
def index():
    res = make_response("Setting a cookie")
    # cookie = res.set_cookie('visits', 1)
    if 'visits' in session:
        session['visits'] = session.get('visits')+1
    else:
        session['visits'] = 1
    return render_template('index.html',visits=session.get('visits'))

@app.route('/cookie')
def cookie():
#     res = make_response("Setting a cookie")
#     res.set_cookie('visits','1')
    if 'visits' in session:
        session['visits'] = session.get('visits')+1
    else:
        session['visits'] = 1
    return("Total visits: {}".format(session.get('visits')))


@app.route('/destroy_session')
def destroy_session():
    session.clear()
    return redirect('/')


if __name__ == ("__main__"):
    app.run(debug=True)