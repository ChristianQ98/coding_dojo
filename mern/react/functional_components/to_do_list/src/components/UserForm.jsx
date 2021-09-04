import React, { useState } from 'react';
import styles from './UserForm.module.css';
import DisplayList from './DisplayList';

const UserForm = (props) => {
    const [list, setList] = useState([]);
    const [item, setItem] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        const newItem = {
            item,
            isDone: false
        }
        /* FOR TESTING: SHOWS THE NEW OBJECT CREATED */
        // console.log(newItem);
        setItem(newItem);
        list.push(newItem);
        /* FOR TESTING: SHOWS THE ENTIRE LIST WITH ALL THE OBJECTS IN IT */
        // console.log(list);
    }

    // Changes isDone to true if it was false, and changes isDone to false if it was true
    const handleIsDone = (idx) => {
        console.log(idx)
        console.log(list[idx]);
        const copyList = [
            ...list
        ];
        copyList[idx].isDone = !copyList[idx].isDone;
        console.log(copyList[idx].isDone);
        setList(copyList);
    }

    // Deletes an item from the list
    const deleteItem = (idx) => {
        console.log(idx);
        const deleteCopy = [
            ...list
        ]
        const newList = deleteCopy.filter( (item, i) => i !== idx)
        setList(newList);
    }

    return (
        <div style={ styles }>
            <form onSubmit={ handleSubmit }>
                <input onChange={ (e) => setItem(e.target.value) }></input>
                <div>
                    <button type="submit" className="btn btn-primary" id={ styles.submit }>Add</button>
                </div>
                </form>
            <DisplayList 
            list={list} 
            handleIsDone={handleIsDone} 
            deleteItem={deleteItem}/>
            
        </div>
    )
}

export default UserForm;