import React from "react";
import { useParams } from 'react-router';

const Number = (props) => {
    const { input } = useParams();
    return (
        <div>
            { isNaN(+ input) ? <p>The word is: { input }</p> : <p>The number is: {input}</p> }
        </div>
    )
}

export default Number;