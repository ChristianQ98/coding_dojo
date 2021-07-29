from flask import Flask
app = Flask(__name__)
# Create a root route ("/") that responds with "Hello World!"
@app.route('/')
def hello_world():
    return "Hello World!"


# Create a route that responds with "Dojo!"
@app.route('/dojo')
def dojo():
    return "Dojo!"


# Create a route that responds with "Hi" and whatever name is in the URL after /say
@app.route('/say/<string:name>')
def say_hi(name):
    return f"Hi {name}!"

# Create a route that responds with the given word repeated as many times as specified in the URL
@app.route('/repeat/<int:number>/<string:word>')
def repeat(number,word):
    return int(number) * word

# Ensure that if the user types in any route other than the ones specified, they receive an error message saying "Sorry! No response. Try again."
@app.errorhandler(404)
def page_not_found(e):
    return "Sorry! No response. Try again."

if __name__ == "__main__":
    app.run(debug=True)
