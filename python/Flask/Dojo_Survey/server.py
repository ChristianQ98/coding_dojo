from flask import Flask, render_template, session, redirect, request
app = Flask(__name__)

app.secret_key = "Hello"

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/process', methods=['POST'])
def survey():
    session['name'] = request.form['name']
    session['dojo_location'] = request.form['dojo_location']
    session['favorite_language'] = request.form['favorite_language']
    session['comment'] = request.form['comment']
    return redirect('/result')

@app.route('/result')
def result():
    return render_template('result.html',
    name = session['name'],
    dojo_location = session['dojo_location'],
    favorite_language = session['favorite_language'],
    comment = session['comment']
    )


if __name__ == "__main__":
    app.run(debug=True)