import React, { useState } from 'react';
import styles from './BoxForm.module.css'
import DisplayBox from './DisplayBox';

const BoxForm = (props) => {
    // The input for color is initially blank
    const [color, setColor] = useState("");

    const [width, setWidth] = useState("");
    const[height, setHeight] = useState("");

    // We create an empty array where all the boxes we create are stored
    const [allBoxes] = useState([]);

    // Called when the form is submitted
    // In charge of creating a new box object
    const addBox = (e) => {
        // Prevents browser from reloading upon hitting submit button
        e.preventDefault();
        const newColor = {
            color: color.toLowerCase(),
            width: width,
            height: height
        };
        // Checks if the inputted value is a color
        let isColor = require('is-color');
        // If it is a color, the value gets stored in the array/list
        if(isColor(newColor.color)) {
            setColor(newColor);
            allBoxes.push(newColor);
            /* FOR TESTING: Logs the color that was inputted and submitted in the form */
            console.log(newColor);
            /* FOR TESTING: Logs the entire array that contains all the colors we have stored */ 
            console.log(allBoxes);
            // Resets the input value after each time the form is submitted
            document.getElementById("box-form").reset();
        } else {
            document.getElementById("box-form").reset();
        }
    }

    // Grabs the value from the input field and stores it in the setColor variable
    const handleColor = e => {
        setColor(e.target.value);
    }

    const handleWidth = e => {
        setWidth(e.target.value);
    }

    const handleHeight = e => {
        setHeight(e.target.value);
    }

    return (
        <div className={ styles }>
            <form onSubmit={ addBox } id="box-form">
                <p>Color: <input onChange={ handleColor } placeholder="Enter a color"></input></p>
                <p>Width: <input type="number" min="1" onChange={ handleWidth } placeholder="Units in vw"></input></p>
                <p>Height: <input type="number" min="1" onChange={ handleHeight } placeholder="Units in vh"></input></p>
                <div>
                    <button type="submit" className="btn btn-primary">Add</button>
                </div>
            </form>
            <DisplayBox allBoxes={ allBoxes }/>
        </div>
    )
}

export default BoxForm;