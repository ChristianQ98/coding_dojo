import React from "react";
import { useParams } from "react-router";

const StyledWord = (props) => {
    const { word } = useParams();
    const { fontColor } = useParams();
    const { bgColor } = useParams();

    return (
        <div>
            <p style={{ color: fontColor , backgroundColor: bgColor }}>The word is: { word }</p>
        </div>
    )
}

export default StyledWord;