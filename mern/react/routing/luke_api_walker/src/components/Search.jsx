import React, { useState } from "react";
import { useHistory } from "react-router";
import styles from './Search.module.css';

const Search = (props) => {
    const history = useHistory();
    const [ category, setCategory ] = useState("people");
    const [ id, setId ] = useState("1");
    
    // const obj = {
    //     attribute: "",
    //     num: 0
    // };

    const handleSearch = (e) => {
        e.preventDefault();
        history.push(`/${category}/${id}`);
    }

    return (
        <div className={ styles }>
            <form id="form" onSubmit={ handleSearch }>
                <p>
                    Search for:
                    <select id="select" onChange={ (e) => setCategory(e.target.value) } defaultValue={ category }>
                        <option value="planets">Planets</option>
                        <option value="starships">Starships</option>
                        <option value="vehicles">Vehicles</option>
                        <option value="people">People</option>
                        <option value="films">Films</option>
                        <option value="species">Species</option>
                    </select> &nbsp;&nbsp;&nbsp;
                    ID: 
                    <input onChange={ (e) => setId(e.target.value)} value={ id }/>
                <button type="submit" className="btn btn-primary">Search</button>
                </p>
            </form>
        </div>
    )
}

export default Search;