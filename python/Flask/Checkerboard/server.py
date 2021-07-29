from flask import Flask, render_template
app = Flask(__name__)

# Have the root route render a template with a checkerboard on it
@app.route('/')
def index():
    return render_template('index2.html', col_num = 8, row_num = 8, color1 = "black", color2 = "red")

# Have another route accept a single parameter (i.e. "/<x>") and render a checkerboard with x many rows, with alternating colors
@app.route('/<int:x>')
def change_display(x):
    return render_template('index2.html', col_num = 8, row_num = x, color1 = "black", color2 = "red")

# Have another route accept 2 parameters (i.e. "/<x>/<y>") and render a checkerboard with x rows and y columns, with alternating color
@app.route('/<int:x>/<int:y>')
def change_row_and_col(x,y):
    return render_template('index2.html', row_num = x, col_num = y, color1 = "black", color2 = "red")

@app.route('/<int:x>/<int:y>/<string:color1>/<string:color2>')
def change_row_col_and_color(x,y,color1,color2):
    return render_template('index2.html', row_num = x, col_num = y, color1 = color1, color2 = color2)

if __name__ == "__main__":
    app.run(debug=True)