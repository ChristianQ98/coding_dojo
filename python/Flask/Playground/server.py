from flask import Flask, render_template
app = Flask(__name__)

@app.route('/play')
def index():
    return render_template("index.html")

@app.route('/play/<int:x>')
def change_num(x):
    return render_template("index.html", num = x)

@app.route('/play/<int:x>/<string:color>')
def change_num_and_color(x,color):
    return render_template("index.html", num = x, color = color)

if __name__ == "__main__":
    app.run(debug=True)