// 1...
const cars = ['Tesla', 'Mercedes', 'Honda']
const [ randomCar ] = cars
const [ ,otherRandomCar ] = cars
//Predict the output
console.log(randomCar)
console.log(otherRandomCar)
// PREDICTION...
    // Tesla
    // Mercedes
// REASON...
    // 'randomCar' is assigned to the first item in the array and 'otherRandomCar' is assigned to the second item in the array


// 2...
const employee = {
    name: 'Elon',
    age: 47,
    company: 'Tesla'
}
const { name: otherName } = employee;
//Predict the output
console.log(name);
console.log(otherName);
// PREDICTION...
    // Error while running console.log(name) because it is not defined
// REASON...
    // 'name' was not defined. Although that is the name of a key, it cannot be called without defining it first


// 3...
const person = {
    name: 'Phil Smith',
    age: 47,
    height: '6 feet'
}
const password = '12345';
const { password: hashedPassword } = person;  
//Predict the output
console.log(password);
console.log(hashedPassword);
// PREDICTION...
    // 12345
    // undefined
// REASON...
    // 'password' was defined and had the value '12345', then it got logged
    // There is no 'password' key in the person object, so it returns 'undefined'


// 4...
const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
const [,first] = numbers;
const [,,,second] = numbers;
const [,,,,,,,,third] = numbers;
//Predict the output
console.log(first == second);
console.log(first == third);
// PREDICTION...
    // false
    // true
// REASON...
    // 'first' gets assigned the value of the 1st index of the 'numbers' array while 'second' gets assigned the value of the 3rd index of the 'numbers' array
    // The first index is 2 and the third index is 5, which when compared, returns false because they are not equal to each other
    // 'third' gets assigned the value of the 8th index of the 'numbers' array, which is the value of 2
    // 2 and 2 are equal, so when compared, it returns true


// 5...
const lastTest = {
    key: 'value',
    secondKey: [1, 5, 1, 8, 3, 3]
}
const { key } = lastTest;
const { secondKey } = lastTest;
const [ ,willThisWork] = secondKey;
//Predict the output
console.log(key);
console.log(secondKey);
console.log(secondKey[0]);
console.log(willThisWork);
//PREDICTION...
    // value
    // [1, 5, 1, 8, 3, 3]
    // 1
    // 5
// REASON...
    // The 'key' variable is assigned to the value of the value of the 'key' key of the lastTest object, which is 'value'
    // The 'secondKey' variable is assigned to the value of the 'secondKey' key of the lastTest object
    // Since it does not specificy a certain part of the value to return, the entire array is logged
    // secondKey[0] logs the 1st item in the array, which is 1
    // 'willThisWork' gets assigned the value of the 1st index (aka the second item) of the secondKey array, which logs a value of 5