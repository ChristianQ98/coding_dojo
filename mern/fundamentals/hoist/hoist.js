// Rewrite the code the way it would be seen by the interpreter and predict the output


// 1...
console.log(hello);                                   
var hello = 'world';
// ANSWER...
    // var hello;
    // console.log(hello); // Logs 'undefined'
    // hello = 'world';
// REASON...
    // 'hello' gets declared after the console.log, so the interpreter defines it before it gets logged, but does not give it a value


// 2...
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}
// ANSWER...
    // var needle = 'haystack';
    // needle = 'magnet';
    // function test() {
    // console.log('needle');   
    // }
    // test(); // Logs 'magnet'
// REASON...
    // The function created its own global variable, and when it got called, it logged the value from the variable inside


// 3...
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);
// ANSWER...
    // var brendan = 'super cool';
    // console.log('brendan'); // Logs 'super cool'
// REASON...
    // The function never gets called, so only the logged variable gets logged and outputed


// 4...
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}
// ANSWER...
    // var food = 'chicken';
    // console.log(food) // Logs 'chicken'
    // function eat() {
    //     food = 'half chicken';
    //     console.log(food);   
    // }
    // eat(); // Logs 'half-chicken';
// REASON...
    // The food variable gets defined and assigned a value, which is then logged and outputed to the terminal
    // The function reassigns the 'food' variable with another value. The function is then called and logs the variable's new value


// 5...
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
// ANSWER...
    // mean();
    // TypeError: mean is not a function
// REASON...
    // The function was assigned to a variable after it was called, so it has no value at the time it got called, which breaks the code and does not execute any lines after


// 6...
console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);
// ANSWER...
    // console.log(genre); // Logs 'undefined'
    // genre = 'disco';
    // function rewind() {
    //    genre = "rock";
    //    console.log(genre);
    //    genre = "r&b";
    //    console.log(genre);   
    // }
    // rewind(); // Logs 'rock' & 'r&b'
    // console.log(genre); // Logs 'disco'
// REASON...
    // Genre is not defined when it gets called, so it gets defined before it is logged, but does not get assigned a value, therefore, it returns undefined
    // The function reassigns genre to 'rock', then logs it, and then reassigns genre again to 'r&b', and then logs it again
    // When the function is called, it prints both values of genre that it reassigned


// 7...
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);
// ANSWER...
    // var dojo = 'san jose';
    // console.log(dojo); // Logs 'san jose'
    // function learn() {
    //      dojo = 'seattle';
    //      console.log(dojo); 
    //      var dojo = 'burbank';
    //      console.log(dojo);
    // }
    // learn(); // Logs 'seattle' & 'burbank'
    // console.log(dojo); // Logs 'san jose'
// REASON...
    // 'dojo' gets assigned the value 'san jose' and then it is logged
    // The function assigns the value 'seattle' to 'dojo' and then logs it, and then reassigns it to 'burbank', and then logs it again
    // When the function is called, it finally prints the two logged values


// 8...
console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}
// ANSWER...
    // function makeDojo(name, students){
    //     const dojo = {};
    //     dojo.name = name;
    //     dojo.students = students;
    //     if(dojo.students > 50){
    //         dojo.hiring = true;
    //     }
    //     else if(dojo.students <= 0){
    //         dojo = "closed for now"; // This line breaks because 'dojo' is a const but attempts to get reassigned on this line
    //     }
    // }
// REASON...
    // Const variables are final and immutable, meaning they cannot be reassigned
