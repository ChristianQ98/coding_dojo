import React, { useState } from 'react';
import DisplayTabs from './DisplayTabs';
import styles from './Tabs.module.css';

const Tabs = (props) => {
    const [allItems, setAllItems] = useState([]);
    const [item, setItem] = useState("");
    const [label, setLabel] = useState(1);
    const [content, setContent] = useState("");
    
    
    const handleSubmit = (e) => {
        e.preventDefault();
        const newItem = {
            label: allItems.length + 1,
            content: content
        };
        setItem(newItem);
        allItems.push(newItem);
        console.log(newItem);
        console.log(allItems);
        document.getElementById("content-input").reset();
    }
    
    const handleContent = (e) => {
        setContent(e.target.value);
    }
    
    return (
        <div>
            <DisplayTabs allItems={ allItems }/>
            <form className={ styles } onSubmit={ handleSubmit } id="content-input">
                <p>Tab Content: <input onChange={ handleContent }></input></p>
                <button id={ styles.submit } className="btn btn-primary">Submit</button>
            </form>
        </div>
    )
}

export default Tabs;