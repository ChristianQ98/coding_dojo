from flask import Flask, render_template, request, redirect, session
import random
app = Flask(__name__)

app.secret_key = "hello"

@app.route('/')
def index():
    if('gold_count' not in session):
        session['gold_count'] = 0
    return render_template('index.html')

@app.route('/process_money', methods=["POST"])
def process_money():
    if(request.form['source'] == 'farm'):
        session['gold_count'] += random.randint(10,20)
    if(request.form['source'] == 'cave'):
        session['gold_count'] += random.randint(5,10)
    if(request.form['source'] == 'house'):
        session['gold_count'] += random.randint(2,5)
    if(request.form['source'] == 'casino'):
        session['gold_count'] += random.randint(-50,50)
    return redirect('/')

if __name__ == "__main__":
    app.run(debug=True)