from flask import Flask, render_template, request, redirect
app = Flask(__name__)  

@app.route('/')         
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])         
def checkout():
    count = int(request.form['strawberry']) + int(request.form['apple']) + int(request.form['raspberry']) + int(request.form['blackberry'])
    print(request.form)
    print("Charging customer name for count fruits")
    return redirect('/')

@app.route('/fruits')         
def fruits():
    return render_template("fruits.html")

if __name__=="__main__":   
    app.run(debug=True)